package com.fajar.submission3.ui.favorit

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.fajar.submission3.data.Repo

class FavoriteViewModel(application: Application): AndroidViewModel(application) {

    private val repository = Repo(application)

    suspend fun getFavoriteList() = repository.getFavoriteList()
}