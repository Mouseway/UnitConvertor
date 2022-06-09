package com.example.unitconvertor.convertor.convertors

import com.example.unitconvertor.convertor.units.CustomUnit
import com.example.unitconvertor.convertor.units.LinearUnit
import com.example.unitconvertor.convertor.units.Unit
import kotlinx.parcelize.Parcelize

@Parcelize
object TemperatureConvertor : Convertor() {
    override val units: List<Unit> = listOf(
        LinearUnit(1.0, "Celsius", "°C"),
        CustomUnit(
            {x -> (x - 32.0) * (5/9)},
            {x -> x * (9.0/5) + 32},
            "Fahrenheit", "°F"
        ),
        CustomUnit(
            {x -> x - 273.15},
            {x -> x + 273.15},
            "Kelvin", "K"
        ),
        CustomUnit(
            {x -> (x - 491.67) * 5.0/9},
            {x -> x * (9.0/5) + 491.67},
            "Rankine", "°R"
        )
    )
    override val defaultUnitPosition: Int = 0
}