package com.simpleapps.symmetricalsniffle.testObject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.simpleapps.simplelibrary.adapter.BaseRecyclerAdapter
import com.simpleapps.simplelibrary.adapter.BaseRecyclerViewHolder
import com.simpleapps.symmetricalsniffle.databinding.ListItemBinding
import com.simpleapps.symmetricalsniffle.testData.ListenerInterface
import com.simpleapps.symmetricalsniffle.testData.RecyclerViewData

class TestAdapter : BaseRecyclerAdapter<TestAdapter.TestViewHolder, RecyclerViewData>() {
    lateinit var listenerInterface: ListenerInterface

    class TestViewHolder(itemView: View, private val listenerInterface: ListenerInterface) :
        BaseRecyclerViewHolder<RecyclerViewData, ListItemBinding>(itemView) {
        init {
            view = ListItemBinding.bind(itemView)
        }

        override fun bind(data: RecyclerViewData) {
            view.itemText.text = data.data
            view.itemText.setOnClickListener {
                listenerInterface.onClick()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
        val view = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TestViewHolder(view.root, listenerInterface)
    }

    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
        holder.bind(mainList[position])
    }

    override fun getItemCount(): Int {
        return mainList.size
    }
}