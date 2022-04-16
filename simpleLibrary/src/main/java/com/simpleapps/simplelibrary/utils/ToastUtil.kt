package com.simpleapps.simplelibrary.utils

import android.content.Context
import android.widget.Toast

class ToastUtil {
    fun toasts(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun toastl(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}