package com.a7medelnoor.randomuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.a7medelnoor.randomuser.adapter.RandomUserAdapter
import com.a7medelnoor.randomuser.app.viewmodel.RandomUserViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel: RandomUserViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.random_user_rv)
        viewModel.getRandomUser()
        val randomUserAdapter =  RandomUserAdapter()
        lifecycleScope.launch {
            viewModel.randomUser.collect{
                randomUserAdapter.submitList(it?.results)
                recyclerView.adapter = randomUserAdapter
            }
        }


    }
}