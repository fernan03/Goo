package com.example.goo

import android.os.Bundle
import android.widget.TextView
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

        val planeta = intent.getParcelableExtra<Lugar>("LUGAR_ID")
        if(planeta !=null){
            findViewById<TextView>(R.id.nombreDetalle).text = planeta.id
            findViewById<TextView>(R.id.rotacionDetalle).text = planeta.rotacion
            findViewById<TextView>(R.id.orbitaDetalle).text = planeta.orbita
            findViewById<TextView>(R.id.climaDetalle).text = planeta.clima
            findViewById<TextView>(R.id.gravedadDetalle).text = planeta.gravedad
            findViewById<TextView>(R.id.terrenoDetalle).text = planeta.terreno
            findViewById<TextView>(R.id.poblacionDetalle).text = planeta.poblacion


        }

    }


}