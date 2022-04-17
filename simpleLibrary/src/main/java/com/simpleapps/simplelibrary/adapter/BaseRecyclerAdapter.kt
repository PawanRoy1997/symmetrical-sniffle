package com.simpleapps.simplelibrary.adapter

import androidx.recyclerview.widget.RecyclerView
import com.simpleapps.simplelibrary.utils.LogUtil

abstract class BaseRecyclerAdapter<Holder : BaseRecyclerViewHolder<DataType, *>, DataType : Any>
    : RecyclerView.Adapter<Holder>() {
    lateinit var mainList: List<DataType>
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