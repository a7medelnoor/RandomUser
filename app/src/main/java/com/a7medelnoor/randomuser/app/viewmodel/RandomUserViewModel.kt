package com.a7medelnoor.randomuser.app.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.a7medelnoor.randomuser.data.enitity.RandomUserResponse
import com.a7medelnoor.randomuser.domain.usecase.GetRandomUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RandomUserViewModel @Inject constructor(
    private val getRandomUserUseCase: GetRandomUserUseCase
): ViewModel() {

     private val _randomUser : MutableStateFlow<RandomUserResponse?> = MutableStateFlow(null)
     val randomUser : StateFlow<RandomUserResponse?> = _randomUser

    fun getRandomUser() {
        viewModelScope.launch {
           try {
               _randomUser.value = getRandomUserUseCase()
           }catch (e: java.lang.Exception){
               Log.e("RandomViewModel", e.message.toString())
           }
        }
    }
}