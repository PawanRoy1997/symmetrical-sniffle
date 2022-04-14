package com.simpleapps.simplelibrary.adapter

import androidx.recyclerview.widget.RecyclerView

abstract class BaseRecyclerAdapter<Holder : BaseRecyclerViewHolder<*, *>>
    :RecyclerView.Adapter<Holder>()