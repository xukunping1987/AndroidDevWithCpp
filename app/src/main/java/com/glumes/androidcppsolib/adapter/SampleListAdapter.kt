package com.glumes.androidcppsolib.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.glumes.androidcppsolib.R
import com.glumes.androidcppsolib.bean.NativeCrashSample
import com.glumes.androidcppsolib.bean.SampleItem

/**
 * Created by glumes on 27/02/2018
 */
class SampleListAdapter : RecyclerView.Adapter<ItemViewHolder>() {


    private var mItems: ArrayList<SampleItem> = ArrayList()

    init {
        mItems.add(SampleItem("title", func = NativeCrashSample()))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(mItems[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.sample_list_item, parent, false))
    }

    override fun getItemCount(): Int {
        return mItems.size
    }

}