package com.simpleapps.simplelibrary.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<Binding : ViewBinding> : AppCompatActivity() {
    lateinit var view: Binding

    abstract fun setView(): Binding
    abstract fun initViews()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view = setView()
        setContentView(view.root)
        initViews()
    }
}