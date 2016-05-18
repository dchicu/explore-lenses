package com.testing.rest

import org.scalatest._
import spray.json.DefaultJsonProtocol._
import spray.json.lenses.JsonLenses._

/**
  * Sample Scala Lenses test.
  */
class SampleLensesSpec extends FlatSpec with Matchers {

  import SampleLensesSpec._

  "STORE_JSON" should
    "have 'Nigel Rees' and 'Evelyn Waugh' authors" in {
    val allAuthors = 'store / 'book / * / 'author
    val authorNames = STORE_JSON.extract[String](allAuthors)

    authorNames === Vector("Nigel Rees", "Evelyn Waugh")
  }
}

object SampleLensesSpec {

  import spray.json.pimpString

  val STORE_JSON =
    """|{
      |  "store": {
      |    "book": [
      |      {
      |        "category": "reference",
      |        "author": "Nigel Rees",
      |        "title": "Sayings of the Century",
      |        "price": 8.95
      |      },
      |      {
      |        "category": "fiction",
      |        "author": "Evelyn Waugh",
      |        "title": "Sword of Honour",
      |        "price": 12.99,
      |        "isbn": "0-553-21311-3"
      |      }
      |    ],
      |    "bicycle": {
      |      "color": "red",
      |      "price": 19.95
      |    }
      |  }
      |}""".stripMargin.parseJson
}
