package com.a7medelnoor.randomuser.data.repo

import com.a7medelnoor.randomuser.data.enitity.RandomUserResponse
import com.a7medelnoor.randomuser.data.local.dao.RandomUserDao
import com.a7medelnoor.randomuser.data.network.ApiService
import com.a7medelnoor.randomuser.domain.repo.RandomUserRepository

class RandomUserRepositoryImpl(private val apiService: ApiService, private val randomUserDao: RandomUserDao): RandomUserRepository {

    override suspend fun getRandomUser(): RandomUserResponse = apiService.getRandomUser()
}