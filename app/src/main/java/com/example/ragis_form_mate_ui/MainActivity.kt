package com.example.ragis_form_mate_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.RadioGroup
import com.example.ragis_form_mate_ui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), RadioGroup.OnCheckedChangeListener,
    CompoundButton.OnCheckedChangeListener {
    private lateinit var binding:ActivityMainBinding   // object hai xml file jo sari id ko hold kerke rakhta hai
    var gender:String?= null
    var arraylist:ArrayList<String> = ArrayList()
    var isCheked:Boolean=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rdGroup.setOnCheckedChangeListener(this)
        binding.cbCoding.setOnCheckedChangeListener(this)
        binding.cbGaming.setOnCheckedChangeListener(this)
        binding.cbReadingNobel.setOnCheckedChangeListener(this)
        binding.cbReadingNobel.setOnCheckedChangeListener(this)
        binding.cbPlayCricket.setOnCheckedChangeListener(this)




        // var gender:String=""




        binding.rbSubmit.setOnClickListener{

       val name = binding.editFname.editText?.text.toString()
        val lastname = binding.editLastname.editText?.text.toString()
        val phone = binding.editMoNumber.editText?.text.toString()
        val Alerphone = binding.editAlmoNumber.editText?.text.toString()
        val email = binding.editEmail.editText!!.text.toString()

        val intent = Intent(this, Secound_Activity::class.java)

        intent.putExtra("Name",name)
        intent.putExtra("lastname", lastname)
        intent.putExtra("Phone", phone)
            intent.putExtra("Al.number",Alerphone)
            intent.putExtra("Email",email)
            intent.putExtra("Gender",gender)
            intent.putExtra("Hobbies",arraylist)
        startActivity(intent)
    }

    }

    override fun onCheckedChanged(chacked: RadioGroup?, p1: Int) {

       when(chacked?.checkedRadioButtonId){
           R.id.rb_malename ->{
               gender = binding.rbMalename.text.toString()
           }
           R.id.rb_femalename ->{
               gender=binding.rbFemalename.text.toString()
           }
           R.id.rb_tran_gender ->{
               gender=binding.rbTranGender.text.toString()
           }
       }
    }

    override fun onCheckedChanged(view: CompoundButton?, isCheked: Boolean) {
        when(view?.id){
            R.id.cb_coding ->{
                if(binding.cbCoding.isChecked){
                    arraylist.add(binding.cbCoding.text.toString())

                }
                else
                {
                  arraylist.remove(binding.cbCoding.text.toString())
                }

            }
            R.id.cb_gaming ->{
                if(binding.cbGaming.isChecked){
                    arraylist.add(binding.cbGaming.text.toString())

                }
                else
                {
                    arraylist.remove(binding.cbGaming.text.toString())

                }

            }
            R.id.cb_tavling ->{
                if(binding.cbTavling.isChecked){
                    arraylist.add(binding.cbTavling.text.toString())

                }
                else
                {
                    arraylist.remove(binding.cbTavling.text.toString())

                }

            }
            R.id.cb_reading_nobel ->{
                if (binding.cbReadingNobel.isChecked) {
                    arraylist.add(binding.cbReadingNobel.text.toString())

                } else {
                    arraylist.remove(binding.cbReadingNobel.text.toString())


                }

            }
            R.id.cb_play_cricket ->{
                if(binding.cbPlayCricket.isChecked){
                    arraylist.add(binding.cbPlayCricket.text.toString())

                }
                else
                {
                    arraylist.remove(binding.cbPlayCricket.text.toString())

                }

            }
        }
    }

}

