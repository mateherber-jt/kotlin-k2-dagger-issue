package dev.kagamirai.k2test

import dagger.Component
import dev.kagamirai.domain.DomainModule
import dev.kagamirai.domain.UberLogger
import javax.inject.Singleton

@Component(modules = [DomainModule::class])
@Singleton
interface ApplicationComponent {
    val logger: UberLogger
}