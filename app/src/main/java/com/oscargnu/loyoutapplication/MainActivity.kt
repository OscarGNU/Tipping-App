package com.oscargnu.loyoutapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.oscargnu.loyoutapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

            var percentage: Int = 0
        binding.rbOptionOne.setOnCheckedChangeListener { _, isChecked ->

            if (isChecked){
                percentage = 10
            }
        }

        binding.rbOptionTwo.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked){
                percentage = 15
            }
        }

        binding.rbOptionThree.setOnCheckedChangeListener { _, isChecked ->

            if (isChecked){
                percentage = 20
            }

        }



        binding.btnClean.setOnClickListener{

            println ("oscar " + binding.tieTotal.text)
            println ("oscar1 " + binding.tieNumPeople.text)
        }

        binding.btnDone.setOnClickListener{
            val totalTable: Float = binding.tieTotal.text.toString().toFloat()
            val nPeople: Int = binding.tieNumPeople.text.toString().toInt()

            val totalTemp = totalTable / nPeople
            val tips = totalTemp * percentage / 100
            val totalWithTips = totalTemp + tips

            binding.tvResult.text = "Total with tips: $totalWithTips"


        }

    }
}