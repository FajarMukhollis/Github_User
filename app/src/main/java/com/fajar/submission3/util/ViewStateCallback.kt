package com.fajar.submission3.util

import android.view.View

interface ViewStateCallback<T> {

    fun onSuccess(data: T)
    fun onLoading()
    fun onFailed(message: String?)

    val invisible: Int
        get() = View.INVISIBLE

    val visible: Int
        get() = View.VISIBLE
}