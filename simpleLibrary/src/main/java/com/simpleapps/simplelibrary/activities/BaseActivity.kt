package com.simpleapps.simplelibrary.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.simpleapps.simplelibrary.utils.LogUtil

abstract class BaseActivity<Binding : ViewBinding> : AppCompatActivity() {
    val TAG = javaClass.simpleName.toString()

    lateinit var view: Binding

    abstract fun setView(): Binding
    abstract fun initViews()

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view = setView()
        setContentView(view.root)
        initViews()
    }
}