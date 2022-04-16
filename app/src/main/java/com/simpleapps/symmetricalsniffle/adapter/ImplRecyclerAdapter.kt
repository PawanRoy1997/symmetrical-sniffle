package com.simpleapps.symmetricalsniffle.adapter

import androidx.recyclerview.widget.LinearLayoutManager
import com.simpleapps.simplelibrary.activities.BaseActivity
import com.simpleapps.symmetricalsniffle.R
import com.simpleapps.symmetricalsniffle.databinding.ActivityImplRecyclerAdapterBinding
import com.simpleapps.symmetricalsniffle.testData.ListenerInterface
import com.simpleapps.symmetricalsniffle.testData.RecyclerViewData
import com.simpleapps.symmetricalsniffle.testObject.TestAdapter

class ImplRecyclerAdapter : BaseActivity<ActivityImplRecyclerAdapterBinding>() {
    private lateinit var listener: ListenerInterface

    override fun setView(): ActivityImplRecyclerAdapterBinding {
        return ActivityImplRecyclerAdapterBinding.inflate(layoutInflater)
    }

    private fun getTestData(): List<RecyclerViewData> {
        return (1..10).map(this::getTestDataForIndex).toList()
    }

    private fun getTestDataForIndex(index: Int): RecyclerViewData {
        return RecyclerViewData(index, "Test Data : $index")
    }

    override fun initViews() {
        listener = object : ListenerInterface {
            override fun onClick() {
                view.textView.text = getString(R.string.clicked)
            }

        }
        val testAdapter = TestAdapter()
        testAdapter.mainList = getTestData()
        testAdapter.listenerInterface = listener
        view.baseRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@ImplRecyclerAdapter)
            adapter = testAdapter
        }
    }
}