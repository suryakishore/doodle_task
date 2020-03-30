package com.example.moviename.movies.movies

import com.example.myapplication.cart.CartData
import com.example.myapplication.cart.UpdateCartRequest
import com.example.myapplication.home.CategoryDetail
import io.reactivex.Observable
import io.reactivex.Single
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH

/**
 * interface for api declarations
 */
interface RetrofitService {
    @GET("categoryList/")
    fun getProductCatById(
        @Header("authorization") authorization: String,
        @Header("STORECATEGORYID") storeCatId: String,
        @Header("language") language: String,
        @Header("categoryId") categoryId: String
    ): Observable<CategoryDetail>


    @GET("cart")
    fun getCartProducts(
        @Header("authorization") authorization: String,
        @Header("language") language: String,
        @Header("platform") platform: Int,
        @Header("currencysymbol") currencySymbol: String,
        @Header("currencycode") currencyCode: String
    ): Observable<CartData>

    @PATCH("cart")
    fun updateCart(
        @Header("authorization") authorization: String,
        @Header("language") language: String,
        @Header("platform") platform: Int,
        @Header("currencysymbol") currencySymbol: String,
        @Header("currencycode") currencyCode: String,
        @Body request: UpdateCartRequest
    ): Observable<Response<ResponseBody>>


}