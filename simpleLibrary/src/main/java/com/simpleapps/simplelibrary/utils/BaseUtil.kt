package com.simpleapps.simplelibrary.utils

abstract class BaseUtil {
    val TAG = javaClass.simpleName.toString()
    fun d(message: String) {
        LogUtil.debug(TAG, message)
    }

    fun v(message: String) {
        LogUtil.verbose(TAG, message)
    }

    fun e(message: String) {
        LogUtil.error(TAG, message)
    }

    fun wtf(message: String) {
        LogUtil.wtf(TAG, message)
    }

    fun blow(message: String, exception: Exception) {
        LogUtil.blow(TAG, message, exception)
    }
}