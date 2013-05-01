package jsonz.patch
import jsonz.JsValue

sealed trait JsPatch {
  def path: String
  def op: String
}

case class JsAdd(path: String, value: JsValue, op: String = "add") extends JsPatch
case class JsCopy(from: String, path: String, op: String = "copy") extends JsPatch
case class JsRemove(path: String, op: String = "remove") extends JsPatch
case class JsReplace(path: String, value: JsValue, op: String = "repalce") extends JsPatch
case class JsMove(from: String, path: String, op: String = "move") extends JsPatch
case class JsTest(path: String, value: JsValue, op: String = "test") extends JsPatch
