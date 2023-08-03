package com.example.assignmentcal

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.assignmentcal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val textResult = binding.tvResult


        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)


        binding.btnPlus.setOnClickListener {
            viewModel.plusLiveData(binding.etNum1.text.toString(), binding.etNum2.text.toString())
        }

        binding.btnMinus.setOnClickListener {
            viewModel.minusLiveData(binding.etNum1.text.toString(), binding.etNum2.text.toString())
        }

        binding.btnMultiply.setOnClickListener {
            viewModel.multiplyLiveData(
                binding.etNum1.text.toString(), binding.etNum2.text.toString()
            )
        }

        binding.btnDivide.setOnClickListener {
            viewModel.divideLiveData(binding.etNum1.text.toString(), binding.etNum2.text.toString())
        }


        viewModel.mainViewStateLiveData.observe(this, Observer {
            textResult.text = viewModel.mainViewStateLiveData.value.toString()
            textResult.visibility = View.VISIBLE

        })


    }

}