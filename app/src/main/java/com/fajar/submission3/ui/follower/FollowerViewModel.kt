package com.fajar.submission3.ui.follower

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.fajar.submission3.data.Repo

class FollowerViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = Repo(application)

    fun getUserFollowers(username: String) = repository.getUserFollowers(username)
}