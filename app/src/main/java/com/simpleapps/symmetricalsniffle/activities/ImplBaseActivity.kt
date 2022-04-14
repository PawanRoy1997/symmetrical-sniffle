package com.simpleapps.symmetricalsniffle.activities

import com.simpleapps.simplelibrary.BaseActivity
import com.simpleapps.symmetricalsniffle.databinding.ActivityMainBinding


class ImplBaseActivity : BaseActivity<ActivityMainBinding>() {
    override fun setView(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun initViews() {
    }
}