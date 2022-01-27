package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        String name = getIntent().getExtras().getString("ds");
        TextView mTextView = findViewById(R.id.tvMain);
        mTextView.setText(name);
         */
    }
    private void sendContact() {
        //get the contact from edittext
        EditText nameEditText = findViewById(R.id.name);
        String contact = nameEditText.getText().toString();
        //put the contact in intent
        Intent cIntent = new Intent();
        cIntent.putExtra("con",contact);
        //set the result
        setResult(RESULT_OK,cIntent);
        //close this activity
        finish();
    }
    public void makeToast(View view) {
        Log.i(TAG,"making toast");
        Toast.makeText(this, "Logging You in", Toast.LENGTH_SHORT).show();
        //go to different activity
        Intent myIntent = new Intent(this,HomeActivity.class);
        myIntent.putExtra("Jan","January");
        startActivity(myIntent);
    }

    public void handleClick(View view) {
        Log.i(TAG,"handling  toast");
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
        Intent dialIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("917867562"));
        startActivity(dialIntent);
    }

}