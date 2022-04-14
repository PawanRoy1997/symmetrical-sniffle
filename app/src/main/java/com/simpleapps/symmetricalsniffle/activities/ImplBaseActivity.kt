package com.simpleapps.symmetricalsniffle.activities

import com.simpleapps.simplelibrary.activities.BaseActivity
import com.simpleapps.symmetricalsniffle.databinding.ActivityMainBinding


class ImplBaseActivity : BaseActivity<ActivityMainBinding>() {
    override fun setView(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun initViews() {
        view.button.setOnClickListener {
            view.helloText.text = "Button Is Pressed"
        }
    }
}