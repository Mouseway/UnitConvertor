package com.example.unitconvertor.convertor.convertors

import com.example.unitconvertor.R
import com.example.unitconvertor.App.Companion.getStringResource
import com.example.unitconvertor.convertor.units.LinearUnit
import com.example.unitconvertor.convertor.units.Unit
import kotlinx.parcelize.Parcelize

@Parcelize
object TimeConvertor : Convertor() {
    override val units: List<Unit> = listOf(
        LinearUnit(
            1.0,
            getStringResource(R.string.second),
            getStringResource(R.string.s)
        ),
        LinearUnit(
            60.0,
            getStringResource(R.string.minute),
            getStringResource(R.string.min)
        ),
        LinearUnit(
            60.0 * 60,
            getStringResource(R.string.hour),
            getStringResource(R.string.h)
        ),
        LinearUnit(
            60.0 * 60 * 24,
            getStringResource(R.string.day),
            getStringResource(R.string.d)
        ),
        LinearUnit(
            60.0 * 60 * 24 * 30.4375,
            getStringResource(R.string.month),
            null
        ),
        LinearUnit(
            31557000.0,
            getStringResource(R.string.year),
            null
        )
    )
    override val defaultUnitPosition: Int = 0

}