package com.thomas.walmarttest.common

import android.content.Context
import android.net.ConnectivityManager
import com.thomas.walmarttest.common.Constants.SERVER_CONNECTION_ERROR_MESSAGE
import com.thomas.walmarttest.common.Constants.SERVER_TIMEOUT_ERROR_MESSAGE
import java.net.ConnectException
import java.net.SocketTimeoutException

fun isNetworkAvailable(context: Context): Boolean {
    val connectivityManager =
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
    val activeNetworkInfo = connectivityManager?.activeNetwork
    return activeNetworkInfo != null
}

fun Exception.getInfo(): String {
    return when(this) {
        is ConnectException -> SERVER_CONNECTION_ERROR_MESSAGE
        is SocketTimeoutException -> SERVER_TIMEOUT_ERROR_MESSAGE
        else -> this.toString()
    }
}