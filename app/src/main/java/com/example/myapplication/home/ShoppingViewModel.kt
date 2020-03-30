package com.example.myapplication.home

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.Constants
import com.example.myapplication.NetworkManager
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient

/**
 * view model class for the shopping list activity
 */
public class ShoppingViewModel : ViewModel() {
    private val mOnClick = MutableLiveData<HomeClick>()
    val mCategoryList = ArrayList<CategoryDetailsModel>()
    private var mutableLiveData = MutableLiveData<ArrayList<CategoryDetailsModel>>()

    /**
     * listens when sort clicked.
     */
    fun onSortClicked() {
        mOnClick.postValue(HomeClick.SORT)
    }

    /**
     * notify when on click of views
     */
    fun getOnClickData(): MutableLiveData<HomeClick> {
        return mOnClick;
    }

    /**
     * call shopping list api.
     */
    fun callShoppingListApi(context: Context) {
        val service = NetworkManager.initializePhythonRetrofit(context)
        service.getProductCatById(
            Constants.TOKEN,
            Constants.STORE_CATEGORY_ID,
            Constants.LANGUAGE,
            Constants.CATEGORY_ID)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe {
                if (it!=null)
                 handleResponse(it.data)
            }
    }

    /**
     * handle the shopping data consists of shopping arrayList
     * through live data we are passing to activity.
     */
    private fun handleResponse(list: ArrayList<CategoryDetailsModel>) {
        mCategoryList.addAll(list)
        mutableLiveData.postValue(mCategoryList)
    }

    /**
     * notify when category list will come.
     */
    fun getShoppingData(): MutableLiveData<ArrayList<CategoryDetailsModel>> {
        return mutableLiveData
    }

}