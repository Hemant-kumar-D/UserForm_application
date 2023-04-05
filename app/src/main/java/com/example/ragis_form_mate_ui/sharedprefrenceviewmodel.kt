package com.example.ragis_form_mate_ui

import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.ViewModel
import java.security.Key

class sharedprefrenceviewmodel(private  var shardprerep:sharedprefrence,private var context: Context):ViewModel() {
    fun savedata(fname:String,lastname:String,monumber:String){
        shardprerep.getprefrence(context).edit().putString(keys.FNAME,fname).commit()
        shardprerep.getprefrence(context).edit().putString(keys.LNAME,lastname).commit()
        shardprerep.getprefrence(context).edit().putString(keys.MOBNO,monumber).commit()
    }
    fun getdata():String{
//        val username=shardprerep.getprefrence(context).getString(keys.FNAME,"")
////        val lasname=shardprerep.getprefrence(context).getString(keys.LNAME,"")
        val monumb=shardprerep.getprefrence(context).getString(keys.MOBNO,"")
        return monumb!!
    }

}