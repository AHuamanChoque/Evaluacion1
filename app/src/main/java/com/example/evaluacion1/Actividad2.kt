package com.example.evaluacion1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.evaluacion1.databinding.ActivityMainBinding

class Actividad2 : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btncalcular2.setOnClickListener(this)
    }

    private fun esNumeroPerfecto(numero: Int): Boolean {
        var suma = 0
        for (i in 1 until numero) {
            if (numero % i == 0) {
                suma += i
            }
        }
        return suma == numero
    }

    override fun onClick(v: View?) {
        val numeroIngresado = binding.etnumero2.text.toString().toIntOrNull()

        if (numeroIngresado != null) {
            val resultado = if (esNumeroPerfecto(numeroIngresado)) {
                "Es perfecto"
            } else {
                "No es perfecto"
            }

            binding.tvmensaje.text = resultado
        } else {
            binding.tvmensaje.text = "Por favor, ingrese un número válido."
        }
    }
}