package com.example.fragment_application

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fragment_application.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding : ActivityMainBinding? = null
    var activityInterface : ActivityInterface? = null
    var number = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding?.btnred?.setOnClickListener {
            activityInterface?.changeColor(1)
        }
        binding?.btngreen?.setOnClickListener {
            activityInterface?.changeColor(2)
        }
        binding?.btnblue?.setOnClickListener {
            activityInterface?.changeColor(3)
        }
    }
    fun incrementNumber(){
        number++
        binding?.btnnumber?.setText(number.toString())
    }
    fun decrementNumber(){
        number--
        binding?.btnnumber?.setText(number.toString())
    }
    fun resetNummber(){
        number = 0
        binding?.btnnumber?.setText(number.toString())
    }
}