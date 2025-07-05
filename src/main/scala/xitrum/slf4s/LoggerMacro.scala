package xitrum.slf4s

import scala.quoted.*

object LoggerMacro {
  def trace(logger: Expr[Logger], msg: Expr[String])(using Quotes): Expr[Unit] = {
    '{ if ($logger.underlying.isTraceEnabled) $logger.underlying.trace($msg) }
  }

  def traceT(logger: Expr[Logger], msg: Expr[String], t: Expr[Throwable])(using Quotes): Expr[Unit] = {
    '{ if ($logger.underlying.isTraceEnabled) $logger.underlying.trace($msg, $t) }
  }

  def debug(logger: Expr[Logger], msg: Expr[String])(using Quotes): Expr[Unit] = {
    '{ if ($logger.underlying.isDebugEnabled) $logger.underlying.debug($msg) }
  }

  def debugT(logger: Expr[Logger], msg: Expr[String], t: Expr[Throwable])(using Quotes): Expr[Unit] = {
    '{ if ($logger.underlying.isDebugEnabled) $logger.underlying.debug($msg, $t) }
  }

  def info(logger: Expr[Logger], msg: Expr[String])(using Quotes): Expr[Unit] = {
    '{ if ($logger.underlying.isInfoEnabled) $logger.underlying.info($msg) }
  }

  def infoT(logger: Expr[Logger], msg: Expr[String], t: Expr[Throwable])(using Quotes): Expr[Unit] = {
    '{ if ($logger.underlying.isInfoEnabled) $logger.underlying.info($msg, $t) }
  }

  def warn(logger: Expr[Logger], msg: Expr[String])(using Quotes): Expr[Unit] = {
    '{ if ($logger.underlying.isWarnEnabled) $logger.underlying.warn($msg) }
  }

  def warnT(logger: Expr[Logger], msg: Expr[String], t: Expr[Throwable])(using Quotes): Expr[Unit] = {
    '{ if ($logger.underlying.isWarnEnabled) $logger.underlying.warn($msg, $t) }
  }

  def error(logger: Expr[Logger], msg: Expr[String])(using Quotes): Expr[Unit] = {
    '{ if ($logger.underlying.isErrorEnabled) $logger.underlying.error($msg) }
  }

  def errorT(logger: Expr[Logger], msg: Expr[String], t: Expr[Throwable])(using Quotes): Expr[Unit] = {
    '{ if ($logger.underlying.isErrorEnabled) $logger.underlying.error($msg, $t) }
  }
}
