package com.example.goo

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class Lugar(
    @SerializedName("name") val id : String,
    @SerializedName("rotation_period") val rotacion: String,
    @SerializedName("orbital_period") val orbita: String,
    @SerializedName("climate") val clima: String,
    //val imagenResId: Int,
    @SerializedName("gravity") val gravedad: String,
    @SerializedName("terrain") val terreno: String,
    @SerializedName("population") val poblacion: String
) : Parcelable

data class RequestLugar(
    @SerializedName("count") val count: Int,
    @SerializedName("next") val next: String,
    @SerializedName("previous") val previousUrl: String,
    @SerializedName("results") val results: MutableList<Lugar>
)
