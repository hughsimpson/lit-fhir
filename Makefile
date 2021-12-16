VERSION ?= local
G_VERSION ?= local
SBT=sbt -DARTIFACTORY_USER="${ARTIFACTORY_USER}" -DARTIFACTORY_PWD="${ARTIFACTORY_PWD}" -Dversion="${VERSION}"
SBT_G=sbt -DARTIFACTORY_USER="${ARTIFACTORY_USER}" -DARTIFACTORY_PWD="${ARTIFACTORY_PWD}" -Dversion="${G_VERSION}"
# Why sed and not grep, you ask? Because grep on mac takes the -E flag, but takes -P on *nix
BENCH_NUMBER=$(shell echo ${CIRCLE_JOB} | sed 's/benchmark//')
CORE_MODULES=core hl7
US_MODULES=usbase uscore
ALL_MODULES=$(CORE_MODULES) $(US_MODULES)

generated-compile:
	$(SBT) $(foreach i,$(ALL_MODULES),$i/compile)

build: build-all-class-models test

benchmark:
	$(SBT) "+bench/testOnly *RegressionBenchmarks${BENCH_NUMBER}"

clean-scala-3-core:
	$(SBT) ++3.0.0 core/clean

clean-scala-3:
	$(SBT) ++3.0.0 core/clean hl7/clean usbase/clean uscore/clean core/test:clean hl7/test:clean usbase/test:clean uscore/test:clean

compile-core: clean-scala-3-core
	$(SBT) +macros/compile $(foreach i,$(ALL_MODULES),+$i/compile) +fhirpath/compile
compile-java:
	$(SBT) $(foreach i,$(ALL_MODULES),$iJava/compile)
compile-bench:
	$(SBT) +bench/test:compile
compile: compile-core compile-java compile-bench

test-java:
	$(SBT) macros/compile
	$(SBT) $(foreach i,$(ALL_MODULES),$i/compile)
	$(SBT) $(foreach i,$(ALL_MODULES),$iJava/compile $iJava/test)

test:
	$(SBT) +common/test +generator/test +macros/test
	$(SBT) $(foreach i,$(CORE_MODULES),+$i/test)
	$(SBT) $(foreach i,$(CORE_MODULES),$iJava/test)
	$(SBT) $(foreach i,$(US_MODULES),+$i/test)
	$(SBT) $(foreach i,$(US_MODULES),$iJava/test)
	$(SBT) +fhirpath/test
	$(SBT) +protoshim/test
	$(SBT) +'bench/testOnly *ExampleTest'

publish:
	$(SBT) +common/publish +macros/publish
	$(SBT) $(foreach i,$(ALL_MODULES),+$i/publish)
	$(SBT) $(foreach i,$(ALL_MODULES),$iJava/publish)
	$(SBT) +fhirpath/publish
	$(SBT) +protoshim/publish

publish-generator:
	$(SBT_G) +common/publish || echo "cannot publish commmon. Continuing anyway"
	$(SBT_G) +generator/publish
publish-local-generator:
	$(SBT_G) +common/publishLocal +generator/publishLocal

publish-local-core:
	$(SBT) +common/publishLocal +macros/publishLocal $(foreach i,$(ALL_MODULES),+$i/publishLocal) +fhirpath/publishLocal
publish-local-java:
	$(SBT) $(foreach i,$(ALL_MODULES),$iJava/publishLocal)
publish-local: publish-local-core publish-local-java

publish-java-m2:
	$(SBT) $(foreach i,$(ALL_MODULES),$iJava/publishM2)
publish-m2:
	$(SBT) +common/publishM2 +macros/publishM2
	$(SBT) $(foreach i,$(ALL_MODULES),+$i/publishM2 $iJava/publishM2)
	$(SBT) +fhirpath/publishM2

publish-all-local:
	$(SBT) +common/publishLocal +common/publishM2 +macros/publishLocal +macros/publishM2 $(foreach i,$(ALL_MODULES),+$i/publishLocal +$i/publishM2 $iJava/publishLocal $iJava/publishM2)

build-hl7-class-models:
	$(SBT) 'project generator' 'run "generate" \
		--javaPackageSuffix=_java \
		--typescriptDir="./generated_typescript"'
	$(SBT) $(foreach i,$(CORE_MODULES),+$i/scalafmtAll)
	$(SBT) $(foreach i,$(CORE_MODULES),$iJava/javafmt)
	./apply_patches.sh

build-all-class-models-dry:
	$(SBT) 'project generator' 'run "generate" \
		--models="usbase=fhir/spec/hl7.fhir.r4.examples/4.0.1/package/StructureDefinition-*;uscore=fhir/spec/hl7.fhir.us.core/3.1.0/package/StructureDefinition-*" \
		--javaPackageSuffix=_java \
		--moduleDependencies="usbase<uscore" \
		--dryRun'

build-all-class-models:
	$(SBT) 'project generator' 'run "generate" \
		--models="usbase=fhir/hl7.fhir.r4.examples/StructureDefinition-*;uscore=fhir/hl7.fhir.us.core/StructureDefinition-*" \
		--javaPackageSuffix=_java \
		--moduleDependencies="usbase<uscore"'
	$(SBT) $(foreach i,$(ALL_MODULES),+$i/scalafmtAll)
	$(SBT) $(foreach i,$(ALL_MODULES),$iJava/javafmt)
	./apply_patches.sh
	$(SBT) $(foreach i,$(ALL_MODULES),+$i/scalafmtAll)

clean-target:
	rm -rf target/ */target

download-deps:
	$(SBT) +update || true

clean-generated-scala:
	rm -rf $(foreach i,$(ALL_MODULES),$i/src/main/scala{-2,-3,}/com/babylonhealth/lit/$i/model)

clean-generated-java:
	rm -rf $(foreach i,$(ALL_MODULES),$i_java/src/main/java/com/babylonhealth/lit/$i_java/builders $i_java/src/main/java/com/babylonhealth/lit/$i_java/codes)

cycle: clean-generated-java clean-generated-scala build-all-class-models test

pull-stuff:
	npm --registry https://packages.simplifier.net install hl7.fhir.r4.core@4.0.1
	rm -rf generator/src/main/resources/searchParams && mkdir generator/src/main/resources/searchParams
	mv node_modules/hl7.fhir.r4.core/SearchParameter-* generator/src/main/resources/searchParams
	mv node_modules/hl7.fhir.r4.core fhir
	rm -rf node_modules package-lock.json
	cat generator/src/main/resources/searchParams/SearchParameter-* \
		| jq '{name: .name, expression: .expression, base: .base}' \
		| jq -s . \
		> generator/src/main/resources/searchParams.json
	rm -rf generator/src/main/resources/searchParams
	# more
	rm -rf fhir node_modules/hl7.fhir.r4.core node_modules/hl7.fhir.r4.examples node_modules/hl7.fhir.us.core && mkdir fhir
	npm --registry https://packages.simplifier.net install hl7.fhir.us.core@3.1.0
	npm --registry https://packages.simplifier.net install hl7.fhir.r4.examples@4.0.1
#	npm --registry https://packages.simplifier.net install hl7.fhir.core@4.0.1
	mv node_modules/hl7.fhir.r4.examples fhir
	mv node_modules/hl7.fhir.us.core fhir
	mv node_modules/hl7.fhir.r4.core fhir

find-weird-ones:
	echo NO BASE:
	cat generator/src/main/resources/searchParams/SearchParameter-* | jq 'select (.base == null) | .id'
	echo MORE THAN ONE BASE:
	cat generator/src/main/resources/searchParams.json | jq '.[] | select(.base[1] != null) | .name'
	echo NO EXPRESSION:
	cat generator/src/main/resources/searchParams/SearchParameter-* | jq 'select (.expression == null) | .id'
