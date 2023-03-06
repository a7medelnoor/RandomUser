package com.a7medelnoor.randomuser.data.enitity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "random_user")
data class Result(
    @PrimaryKey(autoGenerate = true)
    val id: Id,
    @ColumnInfo(name = "email")
    val email: String,
    @ColumnInfo(name = "gender")
    val gender: String,
    @ColumnInfo(name = "name")
    val name: Name,
    @ColumnInfo(name = "phone")
    val phone: String,
    @ColumnInfo(name = "picture")
    val picture: Picture,

    )