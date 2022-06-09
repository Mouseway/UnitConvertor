package com.example.unitconvertor.convertor.convertors

import com.example.unitconvertor.R
import com.example.unitconvertor.App.Companion.getStringResource
import com.example.unitconvertor.convertor.units.LinearUnit
import com.example.unitconvertor.convertor.units.Unit
import kotlinx.parcelize.Parcelize

@Parcelize
object LengthConvertor : Convertor() {
    override val units: List<Unit> = listOf(
        LinearUnit(
            1000.0,
            getStringResource(R.string.kilometer),
            getStringResource(R.string.km)
        ),
        LinearUnit(
            1.0,
            getStringResource(R.string.meter),
            getStringResource(R.string.m)
        ),
        LinearUnit(
            0.1,
            getStringResource(R.string.decimeter),
            getStringResource(R.string.dm)
        ),
        LinearUnit(
            0.01,
            getStringResource(R.string.centimeter),
            getStringResource(R.string.cm)
        ),
        LinearUnit(
            0.001,
            getStringResource(R.string.millimeter),
            getStringResource(R.string.mm)
        ),
        LinearUnit(
            1609.0,
            getStringResource(R.string.mile),
            getStringResource(R.string.mi)
        ),
        LinearUnit(
            0.9144,
            getStringResource(R.string.yard),
            getStringResource(R.string.yd)
        ),
        LinearUnit(
            0.3048,
            getStringResource(R.string.foot),
            getStringResource(R.string.ft)
        )
    )
    override val defaultUnitPosition: Int = 1
}