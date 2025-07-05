package xitrum.slf4s

import org.slf4j.{LoggerFactory => Underlying}
import scala.reflect.ClassTag

object LoggerFactory {
  inline def apply[A](using ct: ClassTag[A]): Logger = getLogger[A]
  def apply(name: String): Logger = getLogger(name)
  def apply(clazz: Class[?]): Logger = getLogger(clazz)
  inline def getLogger[A](using ct: ClassTag[A]): Logger = Logger(Underlying.getLogger(ct.runtimeClass))
  def getLogger(name: String): Logger = Logger(Underlying.getLogger(name))
  def getLogger(clazz: Class[?]): Logger = Logger(Underlying.getLogger(clazz))
}
