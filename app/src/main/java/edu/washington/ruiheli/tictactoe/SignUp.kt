package edu.washington.ruiheli.tictactoe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val actionBar = supportActionBar
        actionBar!!.hide()
    }
}
