package com.simpleapps.symmetricalsniffle.utils

import com.simpleapps.simplelibrary.activities.BaseActivity
import com.simpleapps.simplelibrary.utils.ToastUtil
import com.simpleapps.symmetricalsniffle.databinding.ActivityToastUtilBinding

class ToastUtilActivity : BaseActivity<ActivityToastUtilBinding>() {
    override fun setView(): ActivityToastUtilBinding {
        return ActivityToastUtilBinding.inflate(layoutInflater)
    }

    override fun initViews() {
        view.smallToast.setOnClickListener { ToastUtil.toasts(this, "Small Toast")}
        view.longToast.setOnClickListener { ToastUtil.toasts(this, "Long Toast")}
    }
}