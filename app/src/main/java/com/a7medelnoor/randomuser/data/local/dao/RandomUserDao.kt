package com.a7medelnoor.randomuser.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Inject

@Dao
interface RandomUserDao {

    @androidx.room.Query("Select * from random_user")
    fun getAllRandomUsers(): List<com.a7medelnoor.randomuser.data.enitity.Result>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRandomUser(result: com.a7medelnoor.randomuser.data.enitity.Result)

}