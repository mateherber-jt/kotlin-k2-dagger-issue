package dev.kagamirai.domain

import dev.kagamirai.core.CoreActivity
import javax.inject.Inject

abstract class DomainActivity : CoreActivity() {
    @Inject
    lateinit var uberLogger: UberLogger
}