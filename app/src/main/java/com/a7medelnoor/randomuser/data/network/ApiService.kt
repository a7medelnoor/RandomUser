package com.a7medelnoor.randomuser.data.network

import com.a7medelnoor.randomuser.data.enitity.RandomUserResponse
import retrofit2.http.GET

interface ApiService {
    @GET("api/?results=200")
    suspend fun getRandomUser(): RandomUserResponse
}