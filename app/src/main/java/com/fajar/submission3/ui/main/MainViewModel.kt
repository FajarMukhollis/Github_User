package com.fajar.submission3.ui.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.fajar.submission3.data.Repo

class MainViewModel(application: Application): AndroidViewModel(application) {

    private val repository = Repo(application)

    fun searchUser(query: String) = repository.searchUser(query)
}