package dev.kagamirai.core

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface CoreModule {

    @Singleton
    @Binds
    fun provideLogger(logger: LoggerImpl): Logger
}