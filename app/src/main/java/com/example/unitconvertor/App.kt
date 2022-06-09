package com.example.unitconvertor

import android.app.Application
import android.content.Context


class App : Application() {

    override fun onCreate() {
        super.onCreate()
        mContext = this
    }

    companion object {
        private var mContext: Context? = null
        val context: Context?
            get() = mContext

        fun getStringResource(id: Int): String = context?.getString(id) ?: ""
    }
}