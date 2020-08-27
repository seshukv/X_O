package com.example.x_o;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class homepage extends AppCompatActivity {

    int u = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        getSupportActionBar().hide();


        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        final TextView b3 = findViewById(R.id.b3);
        final TextView b4 = findViewById(R.id.b4);
        final TextView b5 = findViewById(R.id.b5);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj = new Intent(homepage.this, MainActivity.class);
                startActivity(obj);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (u == 1) {
                    b3.setVisibility(View.VISIBLE);
                    b4.setVisibility(View.VISIBLE);
                    b5.setVisibility(View.VISIBLE);
                }
                if (u == 2) {
                    b3.setVisibility(View.GONE);
                    b4.setVisibility(View.GONE);
                    b5.setVisibility(View.GONE);
                    u = 0;
                }
                u++;

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj1 = new Intent(homepage.this, tournament.class);
                obj1.putExtra("number", 5);
                startActivity(obj1);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj2 = new Intent(homepage.this, tournament.class);
                obj2.putExtra("number", 7);
                startActivity(obj2);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj3 = new Intent(homepage.this, tournament.class);
                obj3.putExtra("number", 9);
                startActivity(obj3);
            }
        });

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


    }


}