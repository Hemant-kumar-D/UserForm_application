package com.example.ragis_form_mate_ui

import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.ragis_form_mate_ui.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(), View.OnClickListener {
     private lateinit var binding:ActivityLoginBinding
     lateinit var viewModel: sharedprefrenceviewmodel
     lateinit var factory:viewmodelfactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        factory=viewmodelfactory(sharedprefrence,this)
        viewModel = ViewModelProvider(this,factory)[sharedprefrenceviewmodel::class.java]





        binding.textSignin.setOnClickListener(this)
        binding.btnLogin.setOnClickListener(this)


    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.text_signin ->{



                startActivity(Intent(this,SignActivity::class.java))
            }
            R.id.btn_login->{

              if(binding.editFname.text.toString().isEmpty()&&binding.editLastname.text.toString()
                      .isEmpty()&&binding.editMonumber.text.toString().isEmpty()){
                  Toast.makeText(this, "Please fill value", Toast.LENGTH_SHORT).show()

              }
                else{
                  Toast.makeText(this, "succesfully ragisterd", Toast.LENGTH_SHORT).show()
                  viewModel.savedata(binding.editFname.text.toString(),binding.editLastname.text.toString(),
                      binding.editMonumber.text.toString())

                  startActivity(Intent(this,MainActivity::class.java))
              }



            }

        }

    }
}