package com.a7medelnoor.randomuser.di

import com.a7medelnoor.randomuser.data.network.ApiService
import com.a7medelnoor.randomuser.data.repo.RandomUserRepositoryImpl
import com.a7medelnoor.randomuser.domain.repo.RandomUserRepository
import com.a7medelnoor.randomuser.domain.usecase.GetRandomUserUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    fun provideUseCase(randomUserRepository: RandomUserRepository): GetRandomUserUseCase {
        return GetRandomUserUseCase(randomUserRepository)
    }
}