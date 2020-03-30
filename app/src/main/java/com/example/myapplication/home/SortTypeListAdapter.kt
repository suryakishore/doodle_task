package com.example.myapplication.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.ItemClick
import com.example.myapplication.R

/**
 * adapter class for the bottom sheet.
 */
public class SortTypeListAdapter(val itemClick: ItemClick, val sortList: ArrayList<String>) : RecyclerView.Adapter<SortTypeListAdapter.ViewHolder>() {
    lateinit var mContext: Context
    lateinit var mSortList: ArrayList<String>
    lateinit var mItemClick:ItemClick
    init {
        mSortList = sortList
        mItemClick=itemClick
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SortTypeListAdapter.ViewHolder {
        mContext = parent.context;
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_sort, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return mSortList.size;
    }

    override fun onBindViewHolder(holder: SortTypeListAdapter.ViewHolder, position: Int) {
        holder.tvSortName.setText(mSortList.get(position))
         holder.tvSortName.setOnClickListener {

             mItemClick.onClick(position)
         }

    }

    /**
     * view holder class for the sort type list
     */
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         var tvSortName: AppCompatTextView

        init {
            tvSortName = itemView.findViewById(R.id.tvSortName)

        }
    }


}