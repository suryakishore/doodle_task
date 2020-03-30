package com.example.myapplication.cart

import android.os.Bundle
import android.view.Gravity
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.appcompat.widget.ListPopupWindow
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.myapplication.*
import com.example.myapplication.databinding.ActivityGoToCartBinding
import java.util.*

/**
 * this will show the cart items
 */
class GoToCartActivity : AppCompatActivity(), QuantityClick, PopupClicked {


    lateinit var mActivityGoToCartBinding: ActivityGoToCartBinding
    lateinit var mCartModel: CartModel
    lateinit var mCartAdapter: CartAdapter
    lateinit var ivBackBtn: AppCompatImageView
    lateinit var mPopupWindow: ListPopupWindow
    val mProductItemList = ArrayList<CartProductItemDetails>()

    var position = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initializeView()
        initializeViewModel()
        cartData()
        if (Utility.isNetworkAvailable(this))
        mCartModel.callGetCartProductsApi(this)
        else {
            val toast = Toast.makeText(applicationContext, resources.getString(R.string.networkWarning), Toast.LENGTH_LONG)
            toast.show()
        }
    }

    /**
     * this method is used to initialize the view
     */
    private fun initializeView() {
        mActivityGoToCartBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_go_to_cart)
        ivBackBtn = findViewById(R.id.ivBackBtn)
        ivBackBtn.setOnClickListener {
            finish()
        }
    }

    /**
     * this method is used to initialize for viewModel
     */
    private fun initializeViewModel() {
        mCartModel = ViewModelProviders.of(this).get(CartModel::class.java)
        mActivityGoToCartBinding.viewModel = mCartModel
        mCartAdapter = CartAdapter(mProductItemList, this)
        mActivityGoToCartBinding.rvCartItems.adapter = mCartAdapter
    }

    /**
     * quantity click
     */
    override fun onQuantityClick(int: Int, textView: AppCompatTextView, action: Int) {
        position = int
        if (action == Constants.DELETE_CART) {
            var cartItem = mProductItemList.get(position)
            mActivityGoToCartBinding.progressBar.visibility = VISIBLE
            mCartModel.callUpdateCartApi(
                this,
                cartItem.centralProductId,
                cartItem._id,
                cartItem.unitId,
                cartItem.storeId,
                cartItem.name,
                0, action
            )
        } else {
            val quantity = resources.getStringArray(R.array.quantity)
            var popUpAdapter = PopUpAdapter(quantity.toList() as ArrayList<String>, this)
            mPopupWindow = ListPopupWindow(this);
            mPopupWindow.setAdapter(popUpAdapter)
            mPopupWindow.height = ViewGroup.LayoutParams.WRAP_CONTENT
            mPopupWindow.setDropDownGravity(Gravity.BOTTOM)
            mPopupWindow.setOverlapAnchor(false)
            mPopupWindow.anchorView = textView
            if (!mPopupWindow.isShowing) {
                mPopupWindow.show()
            }
        }
    }

    /**
     * subscribe to shopping data.
     */
    private fun cartData() {

        mCartModel.getProductData().observe(this, androidx.lifecycle.Observer {
            mActivityGoToCartBinding.progressBar.visibility = GONE
            mProductItemList.clear()
            mProductItemList.addAll(it)
            mCartAdapter.notifyDataSetChanged()
        })
    }


    override fun onQtyClick(name: String) {
        if (mPopupWindow.isShowing) {
            mPopupWindow.dismiss()
        }
        var cartItem = mProductItemList.get(position)
        cartItem.quantity.value = name
        mCartAdapter.notifyItemChanged(position)
        mActivityGoToCartBinding.progressBar.visibility = VISIBLE
        mCartModel.callUpdateCartApi(
            this,
            cartItem.centralProductId,
            cartItem._id,
            cartItem.unitId,
            cartItem.storeId,
            cartItem.name,
            name.toInt(), Constants.UPDATE_QUANTITY
        )
    }
}
