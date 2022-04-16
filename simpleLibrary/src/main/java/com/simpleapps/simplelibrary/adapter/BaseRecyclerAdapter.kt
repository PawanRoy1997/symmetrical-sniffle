package com.simpleapps.simplelibrary.adapter

import androidx.recyclerview.widget.RecyclerView

abstract class BaseRecyclerAdapter<Holder : BaseRecyclerViewHolder<DataType, *>, DataType : Any>
    : RecyclerView.Adapter<Holder>() {
    lateinit var mainList: List<DataType>
}