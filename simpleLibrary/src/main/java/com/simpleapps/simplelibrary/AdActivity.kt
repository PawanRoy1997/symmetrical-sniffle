package com.simpleapps.simplelibrary

import android.os.Bundle
import androidx.viewbinding.ViewBinding

abstract class AdActivity<Binding: ViewBinding>: BaseActivity<Binding>(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        handleAds()
    }

    abstract fun handleAds()
}