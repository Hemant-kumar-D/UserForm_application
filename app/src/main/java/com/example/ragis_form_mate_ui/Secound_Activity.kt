package com.example.ragis_form_mate_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ragis_form_mate_ui.databinding.ActivityMainBinding
import com.example.ragis_form_mate_ui.databinding.ActivitySecoundBinding
import java.util.jar.Attributes.Name

class Secound_Activity : AppCompatActivity() {
    private lateinit var bindind:ActivitySecoundBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindind=ActivitySecoundBinding.inflate(layoutInflater)
        setContentView(bindind.root)
        val intent = intent
        val name = intent.getStringExtra("Name")
        val lastname = intent.getStringExtra("lastname")
        val phone = intent.getStringExtra("Phone")
        val alphoe = intent.getStringExtra("Al.number")
        val email= intent.getStringExtra("Email")
        val gender=intent.getStringExtra("Gender")
        val hobbie=intent.getStringExtra("Hobbies")

        bindind.textView1.text= "Name->"+name+lastname+"\nMo.NO->"+phone+"\nAlternate.NO->"+alphoe+
                "\nEmail->"+email+"\nGender->"+gender+"\nHobbies->"+hobbie





    }
}