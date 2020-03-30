package com.example.myapplication

import android.content.Context
import com.example.moviename.movies.movies.RetrofitService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * used to initialize the python server and base server using retrofit.
 */
class NetworkManager {


    companion object {
        private val httpClientPhython = OkHttpClient().newBuilder()
        private val httpClient = OkHttpClient().newBuilder()
        /**
         * initialize retrofit for the python server
         */
        public fun initializePhythonRetrofit(context: Context): RetrofitService {
            httpClientPhython.sslSocketFactory(
                SSLCertificate.initSSL(context)!!.socketFactory,
                SSLCertificate.systemDefaultTrustManager()
            )
            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.BODY
            val client = httpClientPhython
                .addInterceptor(interceptor).build()
            val retrofit = Retrofit.Builder()
                .baseUrl(BuildConfig.PHYTHONURL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClientPhython.build())
                .build()

            val service = retrofit.create(RetrofitService::class.java)
            return service
        }
        /**
         * initialize retrofit for the base url server
         */

        fun initializeBaseUrlRetrofit(context: Context): RetrofitService {
            httpClient.sslSocketFactory(
                SSLCertificate.initSSL(context)!!.socketFactory,
                SSLCertificate.systemDefaultTrustManager()
            )
            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.BODY
            val client = httpClient
                .addInterceptor(interceptor).build()
            val retrofit = Retrofit.Builder()
                .baseUrl(BuildConfig.BASEURL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build()
            val service = retrofit.create(RetrofitService::class.java)
            return service
        }


    }


}