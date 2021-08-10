package com.sofudev.viewmodelbasic

import MainActivityViewModelFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.sofudev.viewmodelbasic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory(1)
        viewModel = ViewModelProvider(this, viewModelFactory)[(MainActivityViewModel::class.java)]

        binding.outputTextview.text = viewModel.getCounter().toString()
        binding.countButton.setOnClickListener {
            viewModel.setCounter()
            binding.outputTextview.text = viewModel.getCounter().toString()
        }
    }
}