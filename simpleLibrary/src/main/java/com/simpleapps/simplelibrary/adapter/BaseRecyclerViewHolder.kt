package com.simpleapps.simplelibrary.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.simpleapps.simplelibrary.utils.LogUtil

abstract class BaseRecyclerViewHolder<Data : Any, Binding : ViewBinding>(itemView: View) :
    RecyclerView.ViewHolder(itemView) {
    val TAG = javaClass.simpleName.toString()

    private lateinit var binding: Binding
    val view = binding.root

    abstract fun bind(data: Data)

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