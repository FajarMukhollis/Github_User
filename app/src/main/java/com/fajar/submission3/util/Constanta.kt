package com.fajar.submission3.util

import androidx.annotation.StringRes
import com.fajar.submission3.BuildConfig
import com.fajar.submission3.R


object Constanta {
    const val TIME_SPLASH = 2000L

    const val EXTRA_USER = "EXTRA_USER"

    @StringRes
    val TAB_TITLES = intArrayOf(
        R.string.followers,
        R.string.following
    )

    const val GITHUB_TOKEN = BuildConfig.KEY

    const val BASE_URL = "https://api.github.com"
}