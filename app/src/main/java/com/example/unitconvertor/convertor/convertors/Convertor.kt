package com.example.unitconvertor.convertor.convertors

import android.os.Parcelable
import android.util.Log
import com.example.unitconvertor.convertor.units.Unit
import kotlinx.parcelize.Parcelize

abstract class Convertor : Parcelable {
    abstract val units: List<Unit>
    abstract val defaultUnitPosition: Int
    val defaultUnit
        get() = units[defaultUnitPosition]

    fun convert(value: Double, from: Unit, to: Unit): Double = to.fromBase(from.toBase(value))

    fun getUnitByPosition(pos: Int): Unit = units[pos]

    fun unitsList(): Collection<String> {
        return units.map { unit -> unit.toString() }
    }
}