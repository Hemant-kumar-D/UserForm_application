package com.example.ragis_form_mate_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.ragis_form_mate_ui.databinding.ActivitySignBinding

class SignActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySignBinding
     lateinit var viewmodel:sharedprefrenceviewmodel
     lateinit var factory:viewmodelfactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(this,R.layout.activity_sign)
        factory=viewmodelfactory(sharedprefrence,this)
        viewmodel=ViewModelProvider(this,factory)[sharedprefrenceviewmodel::class.java]


        binding.btnSingLogin.setOnClickListener {

      if(binding.editMoSignActivity.editText?.text.toString().equals(viewmodel.getdata())){

          startActivity(Intent(this,MainActivity::class.java))
      }
            else{
          Toast.makeText(this, "Invalid Number", Toast.LENGTH_SHORT).show()

            }




        }
        binding.textSignup.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
        binding.skip.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))

        }



    }

}