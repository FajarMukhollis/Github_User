package com.fajar.submission3.ui.following

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.fajar.submission3.data.Repo

class FollowingViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = Repo(application)

    fun getUserFollowing(username: String) = repository.getUserFollowing(username)
}