package com.babylonhealth.lit.bench

import scala.io.Source

import ca.uhn.fhir.context.FhirContext
import io.circe.parser.decode
import io.circe.syntax._
import org.hl7.fhir.r4.model.{ Bundle => HBundle, StructureDefinition => HSD }
import org.scalameter.api._
import org.scalameter.{ Persistor, persistence }

import com.babylonhealth.lit.core.LitSeq
import com.babylonhealth.lit.core.model.{ CodeableConcept, Reference }
import com.babylonhealth.lit.core.serdes.{ objectDecoder, objectEncoder }
import com.babylonhealth.lit.hl7.{ BUNDLE_TYPE, CARE_PLAN_INTENT, NARRATIVE_STATUS, REQUEST_STATUS }
import com.babylonhealth.lit.hl7.model.{ Bundle, CarePlan, Narrative, StructureDefinition }
import com.babylonhealth.lit.protoshim.Translator
import com.babylonhealth.lit.uscore.model.Us_core_careplan

abstract class RegressionBenchmark extends Bench.OfflineRegressionReport {
  def index: Int

  /* inputs */
  val rawBundlejson                 = Source.fromResource("exampleBundle.json").mkString
  val rawPatientJson                = Source.fromResource("Patient.Profile.json").mkString
  val sampleBundle                  = decode[Bundle](rawBundlejson).right.get
  val sampleResource: Bundle        = sampleBundle
  val context                       = FhirContext.forR4
  val sampleResourceHapi: HBundle   = context.newJsonParser().parseResource[HBundle](classOf[HBundle], rawBundlejson)
  val singleTest                    = Gen.unit("unit")
  val bundleProtoBytes: Array[Byte] = Translator.resourceToBytes(sampleBundle)

  override val persistor: Persistor = new persistence.GZIPJSONSerializationPersistor(s"target/benchmarks/test$index")
}

object RegressionBenchmarks1 extends RegressionBenchmark {
  /* tests */
  performance of "lit_bundle" in {
    measure method "decode" in { using(singleTest) in (_ => decode[Bundle](rawBundlejson)) }
  }
  def index: Int = 1
}
object RegressionBenchmarks2 extends RegressionBenchmark {
  performance of "lit_bundle_hapi" in {
    measure method "decode" in {
      using(singleTest) in (_ => context.newJsonParser().parseResource[HBundle](classOf[HBundle], rawBundlejson))
    }
  }
  def index: Int = 2
}
object RegressionBenchmarks3 extends RegressionBenchmark {
  performance of "lit_bundle" in {
    measure method "encode" in {
      using(singleTest) in (_ => sampleResource.asJson.noSpaces)
    }
  }

  def index: Int = 3
}
object RegressionBenchmarks4 extends RegressionBenchmark {
  performance of "hapi_bundle" in {
    measure method "encode" in {
      using(singleTest) in (_ => context.newJsonParser().encodeResourceToString(sampleResourceHapi))
    }
  }

  def index: Int = 4
}
object RegressionBenchmarks5 extends RegressionBenchmark {
  performance of "lit_profile" in {
    measure method "decode" in {
      using(singleTest) in (_ => decode[StructureDefinition](rawPatientJson))
    }
  }

  def index: Int = 5
}
object RegressionBenchmarks6 extends RegressionBenchmark {
  performance of "hapi_profile" in {
    measure method "decode" in {
      using(singleTest) in (_ => context.newJsonParser().parseResource[HSD](classOf[HSD], rawPatientJson))
    }
  }

  def index: Int = 6
}
object RegressionBenchmarks7 extends RegressionBenchmark {
  performance of "lit_resource" in {
    measure method "update" in {
      using(singleTest) in (_ => sampleResource.update(_.`type`)(_ => BUNDLE_TYPE.SEARCHSET))
    }
  }

  def index: Int = 7
}
object RegressionBenchmarks8 extends RegressionBenchmark {
  performance of "lit_resource" in {
    measure method ">>" in {
      using(singleTest) in (_ => sampleResource.>>[BUNDLE_TYPE]((_: BUNDLE_TYPE) => BUNDLE_TYPE.SEARCHSET))
    }
  }

  def index: Int = 8
}
object RegressionBenchmarks9 extends RegressionBenchmark {
  performance of "lit_resource" in {
    measure method "nodalMap" in {
      using(singleTest) in (_ => sampleResource nodalMap (classOf[BUNDLE_TYPE], (_: BUNDLE_TYPE) => BUNDLE_TYPE.SEARCHSET))
    }
  }

  def index: Int = 9
}
object RegressionBenchmarks10 extends RegressionBenchmark {
  performance of "lit_resource" in {
    measure method "^^" in {
      using(singleTest) in (_ => sampleResource.^^[BUNDLE_TYPE, BUNDLE_TYPE](identity))
    }
  }

  def index: Int = 10
}
object RegressionBenchmarks11 extends RegressionBenchmark {
  performance of "lit_resource" in {
    measure method "^^^" in { using(singleTest) in (_ => sampleResource.^^^[BUNDLE_TYPE]) }
  }

  def index: Int = 11
}
object RegressionBenchmarks12 extends RegressionBenchmark {
  performance of "lit_resource" in {
    measure method "nodalExtract" in {
      using(singleTest) in (_ => sampleResource nodalExtract (classOf[BUNDLE_TYPE], identity[BUNDLE_TYPE]))
    }
  }

  def index: Int = 12
}
object RegressionBenchmarks13 extends RegressionBenchmark {
  /* tests */
  performance of "lit_bundle" in {
    measure method "decode proto" in {
      using(singleTest) in (_ => Translator.resourceFromBytes(bundleProtoBytes))
    }
  }
  def index: Int = 13
}
object RegressionBenchmarks14 extends RegressionBenchmark {

  performance of "lit_bundle" in {
    measure method "encode proto" in {
      using(singleTest) in (_ => Translator.resourceToBytes(sampleResource))
    }
  }

  def index: Int = 14
}
object RegressionBenchmarks15 extends RegressionBenchmark {
  val o: Us_core_careplan = Us_core_careplan(
    status = REQUEST_STATUS.REVOKED,
    intent = CARE_PLAN_INTENT.PROPOSAL,
    subject = Reference(),
    category = LitSeq(CodeableConcept()),
    text = Narrative(div = "<>", status = NARRATIVE_STATUS.EMPTY)
  )
  performance of "updating" in {
    measure method "update (ascending)" in {
      using(singleTest) in (_ =>
        o.asInstanceOf[CarePlan].setting(_.text)(Some(Narrative(div = "<div/>", status = NARRATIVE_STATUS.EMPTY))))
    }
    measure method "update (near)" in {
      using(singleTest) in (_ => o.setting(_.text)(Narrative(div = "<div/>", status = NARRATIVE_STATUS.EMPTY)))
    }
  }

  def index: Int = 15
}
