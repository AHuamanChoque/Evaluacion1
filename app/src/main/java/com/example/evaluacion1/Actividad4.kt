package com.example.evaluacion1

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.evaluacion1.databinding.ActivityMainBinding

class Actividad4 : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btncalcularnumeros.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        val numeroIngresado = binding.valingreso.text.toString()

        if (numeroIngresado.length == 4) {
            val suma = numeroIngresado.map { it.toString().toInt() }.sum()
            binding.textView4.text = "La suma de los dígitos es: $suma"
        } else {
            binding.textView4.text = "Por favor, ingrese un número de 4 dígitos."
        }
    }
}