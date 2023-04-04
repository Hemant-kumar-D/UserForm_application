package com.example.ragis_form_mate_ui

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class viewmodelfactory(private val sharedPrefRepo: sharedprefrence, private val context: Context):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(sharedprefrenceviewmodel::class.java)){
            return sharedprefrenceviewmodel(sharedPrefRepo, context) as T
        }
        throw IllegalArgumentException("Unknown class")
    }
}