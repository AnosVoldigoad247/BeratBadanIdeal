package com.adhitya.beratbadanideal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tinggi : EditText
    private lateinit var rbLaki : RadioButton
    private lateinit var rbPr : RadioButton
    private lateinit var hitung : Button
    private lateinit var hasil : TextView

    private var tb : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tinggi = findViewById(R.id.tinggiBadan)
        rbLaki = findViewById(R.id.rb_laki)
        rbPr = findViewById(R.id.rb_pr)
        hitung = findViewById(R.id.btn_hitung)
        hasil = findViewById(R.id.hasil)

        hitung.setOnClickListener {
            var tinggi = tinggi.text.toString().toInt()

            if (rbLaki.isChecked){
                tb = (tinggi - 100) - ((tinggi - 100)* 10/100)
                hasil.setText(tb.toString()+"kg")
            } else {
                tb = (tinggi - 100) - ((tinggi - 100)* 15/100)
                hasil.setText(tb.toString()+"kg")
            }
        }
    }
}