package com.amon.seasoncoffee02;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;


public class CoffeeShop extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    Switch mySwitch = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffeeshop);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.coffeesplash);

        mySwitch = findViewById(R.id.switchMain);
        mySwitch.setOnCheckedChangeListener(this);

    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            Intent intent = new Intent(this, OffSwitch.class);
            startActivity(intent);

        } else {
            Intent intent = new Intent(this, OnSwitch.class);
            startActivity(intent);
        }
    }

    }
