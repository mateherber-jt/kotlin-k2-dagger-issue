package dev.kagamirai.core

import android.util.Log
import javax.inject.Inject

class LoggerImpl @Inject constructor() : Logger {
    override fun log(message: String) {
        Log.d("k2test", message)
    }
}
