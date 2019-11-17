package com.klibisz.elastiknn.utils

import java.lang
import java.util

import io.circe.syntax._
import io.circe.{Encoder, Json}

import scala.collection.JavaConverters._

object CirceUtils {

  // This is a hack around not being able to figure out XContentParser and the related garbage for Json parsing.
  implicit def objectEncoder: Encoder[Object] = {
    def encode(obj: Any): Json = obj match {
      case s: lang.String  => s.asJson
      case l: lang.Long    => l.asJson
      case i: lang.Integer => i.asJson
      case d: lang.Double  => d.asJson
      case f: lang.Float   => f.asJson
      case l: util.List[_] => Json.fromValues(l.asScala.map(encode))
      case m: util.Map[_, _] if m.keySet.asScala.forall(_.isInstanceOf[String]) =>
        m.asScala.map {
          case (k, v) => k.asInstanceOf[String] -> encode(v)
        }.asJson
    }
    encode _
  }

  implicit def mapEncoder: Encoder[util.Map[lang.String, Object]] = {
    case h: util.Map[String, Object] => h.asScala.asJson
  }

}