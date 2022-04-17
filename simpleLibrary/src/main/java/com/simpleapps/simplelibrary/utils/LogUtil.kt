package com.simpleapps.simplelibrary.utils

import android.util.Log

object LogUtil {
    fun debug(tag: String, message: String) {
        if (DebugUtil.isDebug) {
            Log.d(tag, message)
        }
    }

    fun verbose(tag: String, message: String) {
        if (DebugUtil.isDebug) {
            Log.v(tag, message)
        }
    }

    fun error(tag: String, message: String) {
        if (DebugUtil.isDebug) {
            Log.e(tag, message)
        }
    }

    fun wtf(tag: String, message: String) {
        if (DebugUtil.isDebug) {
            Log.wtf(tag, message)
        }
    }

    fun blow(tag: String, message: String, ex: Throwable) {
        Log.wtf(tag, message, ex)
    }
}