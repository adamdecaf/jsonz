package jsonz.patch
import jsonz.{JsString, JsObject, JsNumber}

object JsPointersSpec extends JsonzPatchSpec {

  "The JsPointersSpec" should {
    "handle valid and invalid paths" in {
      validPointer.matches(obj) must beTrue
      invalidPointer.matches(obj) must beFalse
    }
  }

  val validPointer = JsPointer("foo/bar")
  val invalidPointer = JsPointer("foo/baz")
  val obj = JsObject(Seq(
    "foo" -> JsObject(Seq(
      "bar" -> JsObject(Seq(
        "name" -> JsString("jsonz"),
        "age" -> JsNumber(33)
      ))
    ))))
}
