package com.fajar.submission3.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.fajar.submission3.model.User


@Database(entities = [User::class], exportSchema = false, version = 1)
abstract class DatabaseUser : RoomDatabase() {
    abstract fun userDao(): DaoUser

    companion object {
        @Volatile
        private var INSTANCE: DatabaseUser? = null

        @JvmStatic
        fun getInstance(context: Context): DatabaseUser {
            if (INSTANCE == null) {
                synchronized(DatabaseUser::class.java) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        DatabaseUser::class.java,
                        "User.db"
                    ).build()
                }
            }
            return INSTANCE as DatabaseUser
        }
    }
}