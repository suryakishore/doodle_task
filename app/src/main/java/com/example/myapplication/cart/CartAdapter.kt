package com.example.myapplication.cart

import android.content.Context
import android.graphics.Paint
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View.GONE
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.Constants
import com.example.myapplication.QuantityClick
import com.example.myapplication.R
import com.example.myapplication.databinding.ItemCartBinding

/**
 * adapter class for the cart items.
 */
public class CartAdapter(productItemDetails: ArrayList<CartProductItemDetails>, quantityClick: QuantityClick) : RecyclerView.Adapter<CartAdapter.CartViewHolder>() {
    lateinit var mQuantityClick: QuantityClick;
    lateinit var mProductItemList: ArrayList<CartProductItemDetails>
    lateinit var mContext: Context

    init {
        mProductItemList = productItemDetails
        mQuantityClick = quantityClick
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartAdapter.CartViewHolder {
        mContext = parent.context
        val layoutInflater = LayoutInflater.from(parent.context)

        val itemBinding: ItemCartBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.item_cart, parent, false)

        return CartViewHolder(itemBinding)

    }

    override fun getItemCount(): Int {
        return mProductItemList.size
    }

    override fun onBindViewHolder(holder: CartAdapter.CartViewHolder, position: Int) {
        var item = mProductItemList.get(position)
        val imgUrl = item.getImages().medium
        if (!TextUtils.isEmpty(imgUrl)) {
            Glide.with(mContext).load(imgUrl).into(holder.mItemBinding.ivShoppingImage)
        }
        holder.mItemBinding.tvProductPrice.setText(item.currencySymbol + "" + item.accounting.unitPrice)


        if (item.accounting.finalTotal != null) {
            if (item.accounting.unitPrice != null) {
                if (item.accounting.finalTotal.toDouble() - item.accounting.unitPrice.toDouble() != 0.0) {
                    holder.mItemBinding.tvActualPrice.setText(item.currencySymbol + "" + item.accounting.finalTotal)
                } else {
                    holder.mItemBinding.tvActualPrice.visibility = GONE
                }
            }
        }
        holder.mItemBinding.tvItemName.setText(item.name)
        holder.mItemBinding.tvItemQty.setText(mContext.resources.getString(R.string.quantity) + " " + item.quantity.value)
        holder.mItemBinding.tvItemQty.setOnClickListener {
            mQuantityClick.onQuantityClick(position, holder.mItemBinding.tvItemQty, 0)
        }

        holder.mItemBinding.tvRemove.setOnClickListener {
            mQuantityClick.onQuantityClick(
                position, holder.mItemBinding.tvItemQty,
                Constants.DELETE_CART
            )
        }

    }

    /**
     * view holder class for the cart items
     */
    class CartViewHolder(itemBinding: ItemCartBinding) : RecyclerView.ViewHolder(itemBinding.root) {
         var mItemBinding: ItemCartBinding

        init {
            mItemBinding = itemBinding
            mItemBinding.tvActualPrice.paintFlags =
                mItemBinding.tvActualPrice.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        }
    }
}