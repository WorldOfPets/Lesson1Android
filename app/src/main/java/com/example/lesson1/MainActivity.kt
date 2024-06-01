package com.example.lesson1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val mainBtn = findViewById<Button>(R.id.mainBtn)
//        binding.mainBtn.setOnClickListener {
//            startActivity(Intent(this, MainActivity2::class.java))
//            finish()
//        }
    }
}