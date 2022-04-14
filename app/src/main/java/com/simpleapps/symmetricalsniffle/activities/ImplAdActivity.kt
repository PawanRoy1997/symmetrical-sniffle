package com.simpleapps.symmetricalsniffle.activities

import com.simpleapps.simplelibrary.activities.AdActivity
import com.simpleapps.symmetricalsniffle.databinding.ActivityImplAdBinding

class ImplAdActivity : AdActivity<ActivityImplAdBinding>() {
    override fun handleAds() {
        view.testTextView.text = "Ad Is Check"
    }

    override fun setView(): ActivityImplAdBinding {
        return ActivityImplAdBinding.inflate(layoutInflater)
    }

    override fun initViews() {
        view.button.setOnClickListener { view.testTextView.text = "Button Is Pressed" }
    }
}