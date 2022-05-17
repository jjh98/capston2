package com.example.capston2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.capston2.databinding.ActivitySub2Binding

class SubActivity2 : AppCompatActivity() {

    val binding by lazy { ActivitySub2Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var intent = Intent(this, SubActivity3::class.java)
        binding.btnStart.setOnClickListener { startActivity(intent) }
    }
}