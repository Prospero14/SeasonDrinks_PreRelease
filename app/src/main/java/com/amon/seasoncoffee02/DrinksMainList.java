package com.amon.seasoncoffee02;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
//основной список напитков
public class DrinksMainList extends AppCompatActivity implements View.OnClickListener {
    ImageButton imageCoffeeButton;
    ImageButton imageTeaButton;
    ImageButton imageLemonadeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coffeemain);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.tealemonadestop);

       // imageCoffeeButton = findViewById(R.id.imageCoffee);
       // imageCoffeeButton.setOnClickListener(this);
        imageTeaButton = findViewById(R.id.imageTea);
        imageTeaButton.setOnClickListener(this);
        imageLemonadeButton = findViewById(R.id.imageLemonade);
        imageLemonadeButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

       /* switch (v.getId()) {
            case R.id.imageCoffee:
                Intent intent = new Intent(this, CoffeeList.class);
                startActivity(intent);
                break;
        }*/
        switch (v.getId()) {
            case R.id.imageTea:
                Intent intent = new Intent(this, TeaList.class);
                startActivity(intent);
                break;
        }
        switch (v.getId()) {
            case R.id.imageLemonade:
                Intent intent = new Intent(this, LemonadeList.class);
                startActivity(intent);
                break;
        }
    }
}

