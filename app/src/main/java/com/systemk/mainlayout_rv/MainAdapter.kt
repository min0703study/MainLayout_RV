package com.systemk.mainlayout_rv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.systemk.mainlayout_rv.databinding.RecyclerMainBinding

class MainAdapter(private val mList: List<MainItem>
) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            DataBindingUtil.inflate<RecyclerMainBinding>(LayoutInflater.from(parent.context), R.layout.recycler_main, parent, false)
        )

    override fun getItemCount(): Int = mList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(mList[position])

    class ViewHolder(private val viewBind: RecyclerMainBinding): RecyclerView.ViewHolder(viewBind.root) {
        fun bind(mainItem: MainItem) {
            viewBind.item = mainItem
        }
    }
}