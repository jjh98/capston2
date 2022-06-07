package com.example.capston2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import com.example.capston2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        //보고서탭
        var intent = Intent(this, SubActivity1::class.java)
        binding.btnStart.setOnClickListener { startActivity(intent) }

        //타이머탭
        var intent1 = Intent(this, SubActivity2::class.java)
        binding.btnStart3.setOnClickListener { startActivity(intent1) }

        //메인탭
        //var intent2 = Intent(this, MainActivity::class.java)
        //binding.btnStart4.setOnClickListener { startActivity(intent2) }

        //동기부여탭
        var intent3 = Intent(this, SubActivity3::class.java)
        binding.btnStart5.setOnClickListener { startActivity(intent3) }

        //설정탭
        var intent4 = Intent(this, SubActivity4::class.java)
        binding.btnStart6.setOnClickListener { startActivity(intent4) }
    }
}