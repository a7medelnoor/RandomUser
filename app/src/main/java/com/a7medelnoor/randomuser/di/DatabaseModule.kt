package com.a7medelnoor.randomuser.di

import android.content.Context
import androidx.room.Insert
import androidx.room.Room
import androidx.room.RoomDatabase
import com.a7medelnoor.randomuser.data.local.RandomUserDatabase
import com.a7medelnoor.randomuser.data.local.dao.RandomUserDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    // provide dao

    @Provides
    fun provideRoomDao(randomUserDatabase: RandomUserDatabase): RandomUserDao{
        return randomUserDatabase.randomUserDao()
    }

    // provide database

    @Provides
    fun provideDatabase(@ApplicationContext applicationContext: Context): RandomUserDatabase {
        return Room.databaseBuilder(
            applicationContext,
            RandomUserDatabase::class.java,
            "random_users"
        ).build()
    }


}