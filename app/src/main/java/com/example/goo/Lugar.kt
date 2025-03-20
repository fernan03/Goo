package com.example.goo

data class Lugar(
    val id : Int,
    val nombre: String,
    val descripcionCorta: String,
    val descripcionCompleta: String,
    val imagenResId: Int,
    val ubicacion: String,
    val mejorTemporada: String,
    val costoPromedio: String
)
