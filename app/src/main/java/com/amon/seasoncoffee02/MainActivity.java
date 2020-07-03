package com.amon.seasoncoffee02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,  CompoundButton.OnCheckedChangeListener {
    ImageButton coffeeMainButton;
    ImageButton drinksMainButton;
    ImageButton placesMainButton;
    Switch mySwitch = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.coffeesplash);

        coffeeMainButton = findViewById(R.id.coffeeMain);
        coffeeMainButton.setOnClickListener(this);
        drinksMainButton = findViewById(R.id.drinksMain);
        drinksMainButton.setOnClickListener(this);
        placesMainButton = findViewById(R.id.placesMain);
        placesMainButton.setOnClickListener(this);
        mySwitch = findViewById(R.id.switchMain);
        mySwitch.setOnCheckedChangeListener(this);


    }
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            Intent intent = new Intent(this, OnSwitch.class);
            startActivity(intent);

        } else {
            Intent intent = new Intent(this, OffSwitch.class);
            startActivity(intent);
        }
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.coffeeMain:
                Intent intent = new Intent(this, CoffeeMain.class);
                startActivity(intent);
                break;
        }
        switch (v.getId()) {
            case R.id.drinksMain:
                Intent intent = new Intent(this, DrinksMain.class);
                startActivity(intent);
                break;
        }
        switch (v.getId()) {
            case R.id.placesMain:
                Intent intent = new Intent(this, Places.class);
                startActivity(intent);
                break;
        }
    }
}



