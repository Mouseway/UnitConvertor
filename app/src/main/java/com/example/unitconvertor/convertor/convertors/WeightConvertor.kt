package com.example.unitconvertor.convertor.convertors

import com.example.unitconvertor.R
import com.example.unitconvertor.App.Companion.getStringResource
import com.example.unitconvertor.convertor.units.LinearUnit
import com.example.unitconvertor.convertor.units.Unit
import kotlinx.parcelize.Parcelize

@Parcelize
object WeightConvertor : Convertor() {
    override val units: List<Unit> = listOf(
        LinearUnit(
            1.0,
            getStringResource(R.string.kilogram),
            getStringResource(R.string.kg)
        ),
        LinearUnit(
            0.001,
            getStringResource(R.string.gram),
            getStringResource(R.string.g)
        ),
        LinearUnit(
            0.000001,
            getStringResource(R.string.milligram),
            getStringResource(R.string.mg)
        ),
        LinearUnit(
            1000.0,
            getStringResource(R.string.tonne),
            getStringResource(R.string.t)
        ),
        LinearUnit(
            1 / 2.2046244,
            getStringResource(R.string.pound),
            getStringResource(R.string.lb)
        ),
        LinearUnit(
            1.0 / 35.2739907,
            getStringResource(R.string.ounce),
            getStringResource(R.string.oz)
        ),
    )
    override val defaultUnitPosition: Int = 0
}