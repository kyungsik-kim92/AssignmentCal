package com.example.assignmentcal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.assignmentcal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    val textResult = binding.tvResult


    binding.btnPlus.setOnClickListener {

        val etNum1 = binding.etNum1.text.toString()
        val etNum2 = binding.etNum2.text.toString()

       textResult.text = (etNum1.toDouble() + etNum2.toDouble()).toString()
        textResult.visibility = View.VISIBLE


    }

        binding.btnMinus.setOnClickListener {

            val etNum1 = binding.etNum1.text.toString()
            val etNum2 = binding.etNum2.text.toString()

            textResult.text = (etNum1.toDouble() - etNum2.toDouble()).toString()
            textResult.visibility = View.VISIBLE


        }

        binding.btnMultiply.setOnClickListener {

            val etNum1 = binding.etNum1.text.toString()
            val etNum2 = binding.etNum2.text.toString()

            textResult.text = (etNum1.toDouble() * etNum2.toDouble()).toString()
            textResult.visibility = View.VISIBLE


        }


        binding.btnDivide.setOnClickListener {

            val etNum1 = binding.etNum1.text.toString()
            val etNum2 = binding.etNum2.text.toString()

            textResult.text = (etNum1.toDouble() / etNum2.toDouble()).toString()
            textResult.visibility = View.VISIBLE


        }



    }

}