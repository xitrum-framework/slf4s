package xitrum.slf4s

trait Logging {
  protected val log: Logger = LoggerFactory.getLogger(this.getClass())
}
