package com.example.myapplication.home

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import androidx.databinding.DataBindingUtil
import com.example.myapplication.ItemClick
import com.example.myapplication.MainActivity
import com.example.myapplication.R
import com.example.myapplication.databinding.ItemBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import java.util.*

/**
 * bottom sheet for showing sort items
 */
class BottomSheetFrag() : BottomSheetDialogFragment(), ItemClick {
    lateinit var mBinding: ItemBottomSheetBinding
    var sortTypes = arrayOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initializeViewModel()
    }

    override fun setupDialog(dialog: Dialog, style: Int) {
        super.setupDialog(dialog, style)

        dialog.setContentView(mBinding.root)

    }

    /**
     * This method is using to initialization of basic resources
     */
    private fun initializeViewModel() {
        mBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.item_bottom_sheet,
            null,
            false
        )
        sortTypes = resources.getStringArray(R.array.sort_types)
        val sortTypeListAdapter = SortTypeListAdapter(this, sortTypes.toList() as ArrayList<String>)
        mBinding.rvSortList.adapter = sortTypeListAdapter
    }

    /**
     * listen when we click on bottom sheet adapter item.
     */
    override fun onClick(int: Int) {
        if (dialog != null) {
            dialog!!.dismiss()
        }
        (activity as MainActivity).onSheetClick(int)
    }

}