package com.example.hotelbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // declare variables done here
    Button reserve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // casting the object to button done here
        reserve=(Button) findViewById(R.id.reserve);
        reserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //starting a new activity namely About
                Intent intent =new Intent(MainActivity.this,AboutActivity.class);
                startActivity(intent);
            }
        });
    }
}