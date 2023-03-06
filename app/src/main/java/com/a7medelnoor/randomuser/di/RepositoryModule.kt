package com.a7medelnoor.randomuser.di

import com.a7medelnoor.randomuser.data.network.ApiService
import com.a7medelnoor.randomuser.data.repo.RandomUserRepositoryImpl
import com.a7medelnoor.randomuser.domain.repo.RandomUserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideRepository(apiService: ApiService): RandomUserRepository {
        return RandomUserRepositoryImpl(apiService)
    }

}