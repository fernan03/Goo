package com.example.goo

import LugarAdapter
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.goo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
    }
    private fun setupRecyclerView(){
        binding.recyclerViewLugares.apply{
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = LugarAdapter(DatosLugares.lugares){lugar ->
                navigateToDetail(lugar)
            }
        }
    }

    private fun navigateToDetail(lugar:Lugar){
        val intent = Intent(this,DetalleActivity::class.java).apply{
            putExtra("LUGAR_ID",lugar.id)
        }
        startActivity(intent)
    }
}