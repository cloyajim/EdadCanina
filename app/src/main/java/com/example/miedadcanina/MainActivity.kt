package com.example.miedadcanina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.miedadcanina.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalcular.setOnClickListener{
            calcular()
        }
    }

    private fun calcular(){
        try {
            val ageString = binding.etEdad.text.toString().toInt() * 7
            binding.tvResult.text = getString(R.string.text_result, ageString)
        } catch (excepcion: Exception){
            Snackbar.make(binding.root, getString(R.string.text_msg_error), Snackbar.LENGTH_LONG).show()
        }

    }

}