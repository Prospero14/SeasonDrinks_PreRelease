package com.amon.seasoncoffee02;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class TeaTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coffeelistone);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.coffeesplash);


    }

}
