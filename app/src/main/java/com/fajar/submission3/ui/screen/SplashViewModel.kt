package com.fajar.submission3.ui.screen

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.asLiveData
import com.fajar.submission3.data.Repo
import kotlinx.coroutines.Dispatchers

class SplashViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = Repo(application)

    fun getThemeSetting() = repository.getThemeSetting().asLiveData(Dispatchers.IO)

}