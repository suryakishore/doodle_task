package com.example.myapplication.home

import android.content.Context
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.ItemClick
import com.example.myapplication.R
import com.example.myapplication.databinding.ItemShoppingBinding

/**
 * adapter class for the shopping list
 */
public class ShoppingListAdapter(
    var categoryList: ArrayList<SubCategoryDetails>,
    var itemClick: ItemClick
) : RecyclerView.Adapter<ShoppingListAdapter.ShoppingViewHolder>() {
    lateinit var mContext: Context
    var mItemClick: ItemClick;
    var mCategoryList: ArrayList<SubCategoryDetails>

    init {
        mItemClick = itemClick
        mCategoryList = categoryList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingViewHolder {
        mContext = parent.context;
        val layoutInflater = LayoutInflater.from(parent.context)

        val itemShoppingBinding: ItemShoppingBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.item_shopping, parent, false)

        return ShoppingViewHolder(itemShoppingBinding)
    }

    override fun onBindViewHolder(holder: ShoppingListAdapter.ShoppingViewHolder, position: Int) {
        val imgUrl = mCategoryList.get(position).imageUrl
        if (!TextUtils.isEmpty(imgUrl)) {
            Glide.with(mContext).load(imgUrl).into(holder.mItemShoppingBinding.ivShoppingImage)
        }
        holder.mItemShoppingBinding.tvItemName.setText(mCategoryList.get(position).subCategoryName)
        holder.mItemShoppingBinding.tvItemPrice.setText(mCategoryList.get(position).itemPrice)

        holder.itemView.setOnClickListener {

            mItemClick.onClick(position)
        }


    }

    override fun getItemCount(): Int {
        return mCategoryList.size;
    }

    /**
     * view holder class for the shopping items
     */
    class ShoppingViewHolder(itemShoppingBinding: ItemShoppingBinding) :
        RecyclerView.ViewHolder(itemShoppingBinding.root) {
        val mItemShoppingBinding: ItemShoppingBinding;

        init {
            mItemShoppingBinding = itemShoppingBinding
        }
    }


}