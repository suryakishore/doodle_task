package com.example.myapplication.cart

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.databinding.DataBindingUtil
import com.example.myapplication.PopupClicked
import com.example.myapplication.R
import com.example.myapplication.databinding.QuantityItemBinding
import java.util.*

/**
 * adapter class used to show the ListPopupWindow
 */
class PopUpAdapter(quantityList: ArrayList<String>, itemClick: PopupClicked) : BaseAdapter() {


    lateinit var mContext: Context
     var mItemClick: PopupClicked
     var mQuantityList: ArrayList<String>

    init {
        mQuantityList = quantityList
        mItemClick = itemClick
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View?

        mContext = parent!!.context
        val holder: PopUpAdapter.ViewHolder
        if (convertView == null) {

            val layoutInflater = LayoutInflater.from(parent.context)

            val quantityItemBinding: QuantityItemBinding =
                DataBindingUtil.inflate(layoutInflater, R.layout.quantity_item, parent, false)

            view = quantityItemBinding.root

            holder = ViewHolder(quantityItemBinding)

            view.tag = holder

        } else {
            view = convertView
            holder = view.tag as ViewHolder
        }

        holder.mQuantityItemBinding.tvQuantity.setText(mQuantityList[position])
        holder.mQuantityItemBinding.tvQuantity.setOnClickListener {
            mItemClick.onQtyClick(mQuantityList[position])

        }
        return view

    }

    override fun getItem(position: Int): Any {
        return mQuantityList[position]

    }

    override fun getItemId(position: Int): Long {
        return 0

    }

    override fun getCount(): Int {
        return mQuantityList.size
    }


    /**
     * <P>Holder class for single  row </P>
     */
    class ViewHolder(quantityItemBinding: QuantityItemBinding) {
        lateinit var mQuantityItemBinding: QuantityItemBinding

        init {
            this.mQuantityItemBinding = quantityItemBinding;

        }

    }

}


