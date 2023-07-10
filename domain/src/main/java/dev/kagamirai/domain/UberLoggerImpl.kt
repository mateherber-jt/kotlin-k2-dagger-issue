package dev.kagamirai.domain

import dev.kagamirai.core.Logger
import javax.inject.Inject

class UberLoggerImpl @Inject constructor(private val logger: Logger) : UberLogger {
    override fun log(message: String) {
        logger.log(message)
    }
}
