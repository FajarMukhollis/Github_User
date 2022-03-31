package com.fajar.submission3.ui.detail

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.fajar.submission3.data.Repo
import com.fajar.submission3.model.User
import kotlinx.coroutines.launch


class DetailViewModel(application: Application): AndroidViewModel(application) {

    val repository = Repo(application)

    suspend fun getDetailUser(username: String) = repository.getDetailUser(username)

    fun insertFavoriteUser(user: User) = viewModelScope.launch {
        repository.insertFavoriteUser(user)
    }

    fun deleteFavoriteUser(user: User) = viewModelScope.launch {
        repository.deleteFavoriteUser(user)
    }
}