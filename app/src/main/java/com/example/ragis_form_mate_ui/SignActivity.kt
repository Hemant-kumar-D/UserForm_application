package com.example.ragis_form_mate_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.ragis_form_mate_ui.databinding.ActivitySignBinding

class SignActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySignBinding
    private lateinit var viewmodel:sharedprefrenceviewmodel
    private lateinit var factory:viewmodelfactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignBinding.inflate(layoutInflater)
        setContentView(binding.root)
        factory=viewmodelfactory(sharedprefrence,this)
        viewmodel=ViewModelProvider(this,factory)[sharedprefrenceviewmodel::class.java]
       // factory=sharedprefrenceviewmodel(sharedprefrence,this)
        //val cuurnumber=binding.editMoSignActivity.editText?.text.toString().toInt()
        binding.btnSingLogin.setOnClickListener {
            val cuurnumber=binding.editMoSignActivity.editText?.text.toString().toInt()
      if(viewmodel.getdata()!= cuurnumber){
          Toast.makeText(this, "please fill valid entry", Toast.LENGTH_SHORT).show()

      }
            else{
                intent= Intent(this,MainActivity::class.java)
          startActivity(intent)
      }



        }
    }
}