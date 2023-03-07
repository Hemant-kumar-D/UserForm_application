package com.example.ragis_form_mate_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.RadioGroup
import android.widget.Toast

import com.example.ragis_form_mate_ui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), RadioGroup.OnCheckedChangeListener,
    CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    private lateinit var binding:ActivityMainBinding   // object hai xml file jo sari id ko hold kerke rakhta hai
    var gender:String?= null
    var arraylist:ArrayList<String> = ArrayList()
  //  var isCheked:Boolean=false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rdGroup.setOnCheckedChangeListener(this)
        binding.cbCoding.setOnCheckedChangeListener(this)
        binding.cbGaming.setOnCheckedChangeListener(this)
        binding.cbReadingNobel.setOnCheckedChangeListener(this)
        binding.cbTavling.setOnCheckedChangeListener(this)
        binding.cbPlayCricket.setOnCheckedChangeListener(this)

        binding.rbSubmit.setOnClickListener(this)




        // var gender:String=""
        }
    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.rb_submit ->{
                if(binding.editFname.editText!!.text.isEmpty()&&binding.editLastname.editText!!.text.isEmpty()&&binding.editMoNumber.editText!!.text.isEmpty()&&binding.
                    editAlmoNumber.editText!!.text.isEmpty()&&binding.editEmail.editText!!.text.isEmpty()){
                    Toast.makeText(this,"Please fill all information",Toast.LENGTH_LONG).show()
                }
                else if(binding.editFname.editText!!.text.isEmpty()){
                    Toast.makeText(this,"Please enter Firstname",Toast.LENGTH_LONG).show()
                    binding.editFname.requestFocus()

                }
                else if(binding.editLastname.editText!!.text.isEmpty()){
                    Toast.makeText(this,"Please enter Lastname",Toast.LENGTH_LONG).show()
                    binding.editLastname.requestFocus()

                }
                else if(binding.editMoNumber.editText!!.text.isEmpty()){
                    Toast.makeText(this,"Please enter Mo.number",Toast.LENGTH_LONG).show()
                    binding.editMoNumber.requestFocus()

                }
                else if(binding.editAlmoNumber.editText!!.text.isEmpty()){
                    Toast.makeText(this,"Please enter Aler.mo.number",Toast.LENGTH_LONG).show()
                    binding.editAlmoNumber.requestFocus()

                }
                else if(binding.editEmail.editText!!.text.isEmpty()){
                    Toast.makeText(this,"Please enter Email",Toast.LENGTH_LONG).show()
                    binding.editEmail.requestFocus()
                }
                else if(binding.editMoNumber.editText?.text.toString().equals(binding.editAlmoNumber.editText!!.text.toString())){
                    Toast.makeText(this,"plese fill diffrent number",Toast.LENGTH_LONG).show()
                }

                else
                {

                    val name = binding.editFname.editText?.text.toString()
                    val lastname = binding.editLastname.editText?.text.toString()
                    val phone = binding.editMoNumber.editText?.text.toString()
                    val Alerphone = binding.editAlmoNumber.editText?.text.toString()
                    val email = binding.editEmail.editText!!.text.toString()
                    val intent = Intent(this, Secound_Activity::class.java)
                    val listname=arraylist.toString().replace("["," ").replace("]"," ")

                    intent.putExtra("Name", name)
                    intent.putExtra("lastname", lastname)
                    intent.putExtra("Phone", phone)
                    intent.putExtra("Al.number", Alerphone)
                    intent.putExtra("Email", email)
                    intent.putExtra("Gender", gender)

                    intent.putExtra("Hobbies", listname)
                    startActivity(intent)

                }
            }

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

