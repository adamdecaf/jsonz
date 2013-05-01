package jsonz.patch
import jsonz.{JsObject, JsValue}

case class JsPointer(path: String) {
  def split: Iterable[String] = path.split("/").toIterable
  def matches(jso: JsObject) = parse(jso).isInstanceOf[Some[JsValue]]

  def parse(jso: JsObject): Option[JsValue] =
    split.foldLeft(Some(jso): Option[JsValue]) { (acc, key) => acc match {
      case Some(obj@JsObject(_)) => obj.get(key)
      case _ => None
    }}
}
