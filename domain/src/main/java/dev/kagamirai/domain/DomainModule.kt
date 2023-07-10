package dev.kagamirai.domain

import dagger.Binds
import dagger.Module
import dev.kagamirai.core.CoreModule
import javax.inject.Singleton

@Module(includes = [CoreModule::class])
interface DomainModule {

    @Singleton
    @Binds
    fun provideLogger(uberLogger: UberLoggerImpl): UberLogger
}