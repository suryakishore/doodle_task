package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View.GONE
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myapplication.Constants.END_YEAR
import com.example.myapplication.Constants.HUNDRED
import com.example.myapplication.Constants.START_YEAR
import com.example.myapplication.Constants.TWO_HUNDRED
import com.example.myapplication.cart.GoToCartActivity
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.home.*

/**
 * Used to show the shopping list which are coming from python server.
 */
class MainActivity : AppCompatActivity(), ItemClick {

    lateinit var mShoppingListAdapter: ShoppingListAdapter
    lateinit var mActivityMainBinding: ActivityMainBinding
    lateinit var mShoppingViewModel: ShoppingViewModel
    lateinit var mBottomSheetFrag: BottomSheetFrag
    lateinit var mGridLayoutManager: GridLayoutManager
    val mCategoryList = ArrayList<SubCategoryDetails>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initializeView()
        initializeViewModel()
        subscribeClickLiveData()
        shoppingData()
        if (Utility.isNetworkAvailable(this))
            mShoppingViewModel.callShoppingListApi(this)
        else {
            val toast = Toast.makeText(
                applicationContext,
                resources.getString(R.string.networkWarning),
                Toast.LENGTH_LONG
            )
            toast.show()
        }
    }

    /**
     * subscribe for on click of the views.
     */
    private fun subscribeClickLiveData() {
        mShoppingViewModel.getOnClickData().observe(this, Observer {

            when (it) {

                HomeClick.SORT -> {
                    mBottomSheetFrag.show(supportFragmentManager, mBottomSheetFrag.getTag())

                }
            }

        })
    }

    /**
     * this method is used to initialize the view
     */
    private fun initializeView() {
        mActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    /**
     * this method is used to initialize for viewModel
     */
    private fun initializeViewModel() {
        mShoppingViewModel = ViewModelProviders.of(this).get(ShoppingViewModel::class.java)
        mActivityMainBinding.viewModel = mShoppingViewModel
        mGridLayoutManager = GridLayoutManager(this, 2)
        mShoppingListAdapter = ShoppingListAdapter(mCategoryList, this)
        mActivityMainBinding.rvShoppingList.layoutManager = mGridLayoutManager
        mActivityMainBinding.rvShoppingList.adapter = mShoppingListAdapter
        mBottomSheetFrag = BottomSheetFrag()
    }

    /**
     * subscribe to shopping data.
     */
    private fun shoppingData() {

        mShoppingViewModel.getShoppingData().observe(this, Observer {
            mActivityMainBinding.progressBar.visibility = GONE
            mCategoryList.addAll(it.get(0).subCategory)
            addThePrice(mCategoryList)
            mShoppingListAdapter.notifyDataSetChanged()

        })

    }

    /**
     * listen when we click on shopping item.
     */
    override fun onClick(int: Int) {

        val intent = Intent(this, GoToCartActivity::class.java)
        startActivity(intent)
    }

    /**
     * this method is used to add the price data and manufactured year,
     * because we are not getting this data from the server.
     */
    private fun addThePrice(subCategory: ArrayList<SubCategoryDetails>) {

        for (item in subCategory) {
            val rnds = (HUNDRED..TWO_HUNDRED).random()
            val rndYear = (START_YEAR..END_YEAR).random()
            item.itemPrice = resources.getString(R.string.currencySymbol) + rnds.toString()
            item.year = rndYear.toString()
        }
    }

    /**
     * listen when bottom sheet item clicked an we are changing data accordingly.
     */
    public fun onSheetClick(int: Int) {
        if (int == 0)
            mCategoryList.sortBy { it.itemPrice }
        else if (int == 1)
            mCategoryList.sortByDescending { it.itemPrice }
        else {
            mCategoryList.sortByDescending { it.year }
        }
        mShoppingListAdapter.notifyDataSetChanged()
    }

}