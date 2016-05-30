package com.example.frederick.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.popularmovies);
        assert button1 != null;
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Popular Movies App", Toast.LENGTH_SHORT).show();
            }
        });

        Button button2 = (Button) findViewById(R.id.stockhawk);
        assert button2 != null;
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Stock Hawk App", Toast.LENGTH_SHORT).show();
            }
        });


        Button button3 = (Button) findViewById(R.id.builditbigger);
        assert button3 != null;
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Build It Bigger App", Toast.LENGTH_SHORT).show();
            }
        });

        Button button4 = (Button) findViewById(R.id.makeyourappmaterial);
        assert button4 != null;
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Make Your App Material App", Toast.LENGTH_SHORT).show();
            }
        });


        Button button5 = (Button) findViewById(R.id.goubiquitous);
        assert button5 != null;
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Go Ubiquitous App", Toast.LENGTH_SHORT).show();
            }
        });

        Button button6 = (Button) findViewById(R.id.capstone);
        assert button6 != null;
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Capston App", Toast.LENGTH_SHORT).show();
            }
        });


    }
}





