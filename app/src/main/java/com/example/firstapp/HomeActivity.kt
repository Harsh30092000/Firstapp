package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    lateinit var monthView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var month = intent.extras?.getString("Jan")
        var monthView = findViewById<TextView>(R.id.month_view)
        monthView.text = month
    }

    fun makeAnotherToast(view: View) {
        Toast.makeText(this,"You Have come to the right Place",Toast.LENGTH_LONG).show()
        var intent = Intent(this,MainActivity::class.java)
        //intent.putExtra("ds","divyang sharma")
        startActivity(intent)
        startActivityForResult(intent,123)
    }
    //result will arrive here -- photo, contact
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == RESULT_OK && requestCode == 123){ //RESULT_OK means its good to consume, 123 -- data being returned is of type contact
            monthView.text = data?.extras?.getString("con")
        }
    }
}