package jsonz.patch
import jsonz._
import jsonz.DefaultFormats._

object DefaultJsPatchFormats extends DefaultJsPatchFormats

trait DefaultJsPatchFormats {
  implicit val JsAddFormat = productFormat3("path", "value", "op")(JsAdd.apply)(JsAdd.unapply)
  implicit val JsCopyFormat = productFormat3("from", "path", "op")(JsCopy.apply)(JsCopy.unapply)
  implicit val JsRemoveFormat = productFormat2("path", "op")(JsRemove.apply)(JsRemove.unapply)
  implicit val JsReplaceFormat = productFormat3("path", "value", "op")(JsReplace.apply)(JsReplace.unapply)
  implicit val JsMoveFormat = productFormat3("from", "path", "op")(JsMove.apply)(JsMove.unapply)
  implicit val JsTestFormat = productFormat3("path", "value", "op")(JsTest.apply)(JsTest.unapply)
}
