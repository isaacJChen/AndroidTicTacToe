package edu.washington.ruiheli.tictactoe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val actionBar = supportActionBar

        val localGame = findViewById<Button>(R.id.localGame)
        val onlineGame = findViewById<Button>(R.id.onlineGame)

        localGame.setOnClickListener {
            val intent = Intent(this, OfflineSetting::class.java)
            startActivity(intent)
        }

        onlineGame.setOnClickListener{
            val intent = Intent(this, Rooms::class.java)
            startActivity(intent)
        }



    }
}
