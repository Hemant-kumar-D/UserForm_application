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
    private lateinit var viewModel: sharedprefrenceviewmodel
    private lateinit var factory:sharedprefrenceviewmodel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[sharedprefrenceviewmodel::class.java]

        factory=sharedprefrenceviewmodel(sharedprefrence,this)



        binding.btnSignIn.setOnClickListener(this)
        binding.btnLogin.setOnClickListener(this)


    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.btn_sign_in ->{

                intent=Intent(this,SignActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_login->{
                if(!binding.editFname.editText!!.text.isEmpty()&& !binding.editLastname.editText!!.text.isEmpty()&&!binding.editMonumber.editText!!.text.isEmpty()){

                    intent= Intent(this,MainActivity::class.java)
                    startActivity(intent)

                }
                else{
                    Toast.makeText(this, "Please enter all field", Toast.LENGTH_SHORT).show()
                }
            }

        }

    }
}