package com.example.unitconvertor.convertor.units

import kotlinx.parcelize.Parcelize

@Parcelize
class LinearUnit(private val ratio: Double, override val label: String, override val mark: String?) : Unit(label, mark) {
    override fun toBase(value: Double) : Double = value * ratio
    override fun fromBase(value: Double): Double = value / ratio
}