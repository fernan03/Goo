package com.example.goo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.goo.databinding.ActivityDetalleBinding

class DetalleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetalleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val lugarId = intent.getIntExtra("LUGAR_ID", -1)
        if (lugarId != -1) {
            mostrarDetalleLugar(lugarId)
        } else {
            finish()
        }
    }

    private fun mostrarDetalleLugar(lugarId: Int) {
        val lugar = DatosLugares.lugares.find { it.id == lugarId }
        lugar?.let {
            binding.apply {
                nombreDetalle.text = it.nombre
                imagenDetalle.setImageResource(it.imagenResId)
                ubicacionDetalle.text = it.ubicacion
                temporadaDetalle.text = it.mejorTemporada
                costoDetalle.text = it.costoPromedio
                descripcionDetalle.text = it.descripcionCompleta
            }
        }
    }
}