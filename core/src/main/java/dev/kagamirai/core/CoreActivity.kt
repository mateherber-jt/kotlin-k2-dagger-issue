package dev.kagamirai.core

import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

abstract class CoreActivity : AppCompatActivity() {
    @Inject
    lateinit var logger: Logger
}