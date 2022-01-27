package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun makeAnotherToast(view: View) {
        Toast.makeText(this,"You Have come to the right Place",Toast.LENGTH_LONG).show()
        var intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}