package com.a7medelnoor.randomuser.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.a7medelnoor.randomuser.data.local.dao.RandomUserDao

@Database(entities = [com.a7medelnoor.randomuser.data.enitity.Result::class], version = 1)
abstract class RandomUserDatabase: RoomDatabase() {
    abstract fun randomUserDao(): RandomUserDao

}