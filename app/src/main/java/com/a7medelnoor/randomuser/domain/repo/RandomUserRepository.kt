package com.a7medelnoor.randomuser.domain.repo

import com.a7medelnoor.randomuser.data.enitity.RandomUserResponse

interface RandomUserRepository {
   suspend fun getRandomUser(): RandomUserResponse
}