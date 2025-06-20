package org.slf4s

import org.slf4j.{Logger => Underlying}

class Logger(val underlying: Underlying) {
  inline def trace(msg: String): Unit = ${ LoggerMacro.trace('this, 'msg) }
  inline def trace(msg: String, t: Throwable): Unit = ${ LoggerMacro.traceT('this, 'msg, 't) }
  inline def debug(msg: String): Unit = ${ LoggerMacro.debug('this, 'msg) }
  inline def debug(msg: String, t: Throwable): Unit = ${ LoggerMacro.debugT('this, 'msg, 't) }
  inline def info(msg: String): Unit = ${ LoggerMacro.info('this, 'msg) }
  inline def info(msg: String, t: Throwable): Unit = ${ LoggerMacro.infoT('this, 'msg, 't) }
  inline def warn(msg: String): Unit = ${ LoggerMacro.warn('this, 'msg) }
  inline def warn(msg: String, t: Throwable): Unit = ${ LoggerMacro.warnT('this, 'msg, 't) }
  inline def error(msg: String): Unit = ${ LoggerMacro.error('this, 'msg) }
  inline def error(msg: String, t: Throwable): Unit = ${ LoggerMacro.errorT('this, 'msg, 't) }
}

object Logger {
  def apply(underlying: Underlying): Logger = new Logger(underlying)
}
