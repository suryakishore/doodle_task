package com.example.myapplication.cart

import android.content.Context
import android.util.Log
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.Constants
import com.example.myapplication.Constants.CURRENCY_CODE
import com.example.myapplication.Constants.CURRENCY_SYMBOL
import com.example.myapplication.Constants.OLD_QUANTITY
import com.example.myapplication.Constants.RETAILER
import com.example.myapplication.Constants.STORE_TYPE_ID
import com.example.myapplication.NetworkManager
import com.example.myapplication.R
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * view model class for the goto cart activity
 */
public class CartModel : ViewModel() {

    val mProductItemList = ArrayList<CartProductItemDetails>()
    private var mutableLiveData = MutableLiveData<ArrayList<CartProductItemDetails>>()
    var cartCount = ObservableField<String>()
    var bagTotal = ObservableField<String>()
    var bagSubTotal = ObservableField<String>()
    var bagTotalPayable = ObservableField<String>()
    var bagTotalAmt = 0.0

    /**
     * used to get the cart items
     */
    fun callGetCartProductsApi(context: Context) {

        val service = NetworkManager.initializeBaseUrlRetrofit(context)
        service.getCartProducts(
            Constants.TOKEN,
            Constants.LANGUAGE,
            Constants.PLATTFORM,
            CURRENCY_SYMBOL, CURRENCY_CODE)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe {
                if (it != null) {
                    if (it.data.accounting.finalTotal != null) {
                        bagTotalAmt = it.data.accounting.finalTotal.toDouble()
                        bagTotal.set(it.data.currencySymbol + " " + bagTotalAmt)
                    }
                    bagSubTotal.set(it.data.currencySymbol + " " + (bagTotalAmt - 10.0).toString())
                    bagTotalPayable.set(bagSubTotal.get())
                    mProductItemList.clear()

                    if (it.data.sellers != null) {
                        for (item in it.data.sellers) {
                            mProductItemList.addAll(item.products)
                        }
                        cartCount.set(context.resources.getString(R.string.item) + "(" + mProductItemList.size + ")")
                        mutableLiveData.postValue(mProductItemList)
                    }
                }
            }

    }

    /**
     * used to update the cart item quantity.
     */
    public fun callUpdateCartApi(
        context: Context, parentPId: String, productId: String, unitId: String, storeId: String,
        productName: String, newQuantity: Int, action: Int
    ) {

        val service = NetworkManager.initializeBaseUrlRetrofit(context)
        service.updateCart(
            Constants.TOKEN,
            Constants.LANGUAGE,
            Constants.PLATTFORM,
            CURRENCY_SYMBOL,
            CURRENCY_CODE,
            UpdateCartRequest(
                RETAILER,
                parentPId,
                productId,
                unitId,
                storeId,
                STORE_TYPE_ID,
                productName,
                "",
                "",
                newQuantity,
                OLD_QUANTITY,
                action
            )
        )
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe {
                Log.d("exe", "itUpdateCart" + it)
                callGetCartProductsApi(context)
            }

    }


    /**
     * notify when category list will come.
     */
    fun getProductData(): MutableLiveData<ArrayList<CartProductItemDetails>> {
        return mutableLiveData
    }
}