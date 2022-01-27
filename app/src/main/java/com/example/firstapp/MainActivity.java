package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeToast(View view) {
        Log.i(TAG,"makong toast");
        Toast.makeText(this, "Logging You in", Toast.LENGTH_SHORT).show();
        //go to different activity
        Intent myIntent = new Intent(this,HomeActivity.class);
        startActivity(myIntent);
    }

    public void handleClick(View view) {
        Log.i(TAG,"handling  toast");
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
    }
}