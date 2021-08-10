package com.sofudev.viewmodelbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.sofudev.viewmodelbasic.databinding.ActivityExerciseBinding

class ExerciseActivity : AppCompatActivity() {
    private lateinit var binding: ActivityExerciseBinding
    private lateinit var viewModel: ExerciseActivityViewModel
    private lateinit var viewModelFactory: ExerciseActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_exercise)
        viewModelFactory = ExerciseActivityViewModelFactory(100)
        viewModel = ViewModelProvider(this, viewModelFactory)[ExerciseActivityViewModel::class.java]

        binding.resultTextview.text = viewModel.getResult().toString()
        binding.sumButton.setOnClickListener {
            viewModel.setResult(binding.inputEdittext.text.toString().toInt())
            binding.resultTextview.text = viewModel.getResult().toString()
        }
    }
}