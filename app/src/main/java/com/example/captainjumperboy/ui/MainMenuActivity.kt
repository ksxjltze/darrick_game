package com.example.captainjumperboy.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.captainjumperboy.R

class MainMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainmenu)

        val startbtn: Button = findViewById(R.id.playbtn)
        val leaderboardBtn: Button = findViewById(R.id.leaderboardBtn)

        startbtn.setOnClickListener {
            Toast.makeText(this, "Game starting!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        leaderboardBtn.setOnClickListener {
            //Go to leaderboard
        }

    }
}
