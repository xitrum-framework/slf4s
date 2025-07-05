package xitrum.slf4s

import org.scalatest.wordspec.AnyWordSpec

class LoggerFactoryExampleSpec extends AnyWordSpec {
  "The LoggerFactory should be familiar" in {
    val log = LoggerFactory.getLogger[LoggerFactoryExampleSpec]
    val importantValue = 10
    log.debug(s"importantValue: $importantValue")
    val importantThrowable = new Throwable
    log.debug(s"importantValue: $importantValue", importantThrowable)
  }
}
