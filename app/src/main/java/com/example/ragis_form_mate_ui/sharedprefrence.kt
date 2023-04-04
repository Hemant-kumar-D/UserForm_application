package com.example.ragis_form_mate_ui

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
private const val FILE_NAME:String="_shapre"
private const val Mode=MODE_PRIVATE

object sharedprefrence {
    fun getprefrence(context: Context):SharedPreferences{

        return context.getSharedPreferences(FILE_NAME, Mode)
    }
}