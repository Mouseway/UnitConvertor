package com.example.unitconvertor.convertor.units

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

abstract class Unit(open val label: String, open val mark: String?) : Parcelable {
    abstract fun toBase(value: Double) : Double
    abstract fun fromBase(value: Double): Double
    override fun toString(): String = if (mark != null) "$label ($mark)" else label
}