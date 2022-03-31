package com.fajar.submission3.data.datastore

import android.annotation.SuppressLint
import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


class DataStoreUser(private val context: Context) {
    companion object {
        @SuppressLint("StaticFieldLeak")
        @Volatile
        private var mInstance: DataStoreUser? = null

        fun getInstance(context: Context): DataStoreUser =
            mInstance ?: synchronized(this) {
                val newInstance = mInstance ?: DataStoreUser(context).also { mInstance = it }
                newInstance
            }
    }

    private val Context.userPreferenceDataStore: DataStore<Preferences> by preferencesDataStore(
        name = UtilDataStore.DATA_STORE_NAME
    )

    suspend fun saveThemeSetting(isDarkModeActive: Boolean) {
        context.userPreferenceDataStore.edit {
            it[UtilDataStore.DATA_STORE_PREF_THEME_KEY] = isDarkModeActive
        }
    }

    fun getThemeSetting(): Flow<Boolean> =
        context.userPreferenceDataStore.data.map {
            it[UtilDataStore.DATA_STORE_PREF_THEME_KEY] ?: false
        }
}