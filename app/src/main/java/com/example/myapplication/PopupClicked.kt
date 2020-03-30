package com.example.myapplication

/**
 * interface listener when we click on popup in cart adapter
 */
interface PopupClicked {
    /**
     * it will return the quantity you selected.
     */
    fun onQtyClick(name:String)

}