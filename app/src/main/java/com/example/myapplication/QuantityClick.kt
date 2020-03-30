package com.example.myapplication

import androidx.appcompat.widget.AppCompatTextView

/**
 * interface listener for the cart item products,used for updating and deleting quantity.
 */
interface QuantityClick {
   fun onQuantityClick(int: Int,textView: AppCompatTextView,action: Int)
}