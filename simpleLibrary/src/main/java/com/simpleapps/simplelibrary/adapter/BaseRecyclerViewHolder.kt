package com.simpleapps.simplelibrary.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseRecyclerViewHolder<Data : Any, Binding : ViewBinding>(itemView: View) :
    RecyclerView.ViewHolder(itemView) {
    lateinit var view: Binding

    abstract fun bind(data: Data)
}