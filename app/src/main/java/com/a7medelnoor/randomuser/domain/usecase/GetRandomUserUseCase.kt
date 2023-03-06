package com.a7medelnoor.randomuser.domain.usecase

import com.a7medelnoor.randomuser.domain.repo.RandomUserRepository

class GetRandomUserUseCase(private val randomUserRepository: RandomUserRepository) {
    suspend  operator  fun invoke() = randomUserRepository.getRandomUser()
}