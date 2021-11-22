package com.example.basicrest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.basicrest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val vm : MainActivityViewModel by viewModels()

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            vm.search()
        }


        vm.resultResponse.observe(
            this, {
                binding.tx1.setText(it.postId)
                binding.tx2.setText(it.id)
                binding.tx3.setText(it.name)
                binding.tx4.setText(it.email)
                binding.tx5.setText(it.body)
            }
        )

    }
}