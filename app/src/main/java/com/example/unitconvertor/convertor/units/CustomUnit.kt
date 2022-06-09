package com.example.unitconvertor.convertor.units

import kotlinx.parcelize.Parcelize

@Parcelize
class CustomUnit(val toBaseLam: (value: Double) -> Double,
                 val fromBaseLam: (value: Double) -> Double,
                 override val label: String,
                 override val mark: String?) : Unit(label, mark) {


    override fun toBase(value: Double): Double = toBaseLam(value)

    override fun fromBase(value: Double): Double = fromBaseLam(value)

}