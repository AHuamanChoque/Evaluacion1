package com.example.evaluacion1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.evaluacion1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btncalcular.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val horasTrabajadas = binding.etnumero1.text.toString().toInt()

        val salario: Int

        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * 16
        } else {
            val horasExtras = horasTrabajadas - 40
            salario = (40 * 16) + (horasExtras * 20)
        }
        binding.tvresultado.text = "El salario semanal es: S/. $salario"
    }
}