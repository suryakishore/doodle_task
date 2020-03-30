package com.example.myapplication

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo

class Utility {


    companion object {
        fun isNetworkAvailable(context: Context): Boolean {
            var connectivity: ConnectivityManager? = null
            try {
                connectivity =
                    context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
                if (connectivity != null) {
                    val info = connectivity.allNetworkInfo
                    if (info != null) {
                        for (i in info.indices) {
                            if (info[i].state == NetworkInfo.State.CONNECTED) {
                                return true
                            }
                        }
                    }
                }
                return false
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                if (connectivity != null) {
                    connectivity = null
                }
            }
            return false
        }
    }
}