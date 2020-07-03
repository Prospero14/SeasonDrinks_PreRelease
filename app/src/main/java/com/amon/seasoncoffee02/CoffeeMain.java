package com.amon.seasoncoffee02;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class CoffeeMain extends AppCompatActivity implements View.OnClickListener {
    ImageButton imageCoffeeButton;
    ImageButton imageTeaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coffeemain);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.toplogo);

        imageCoffeeButton = findViewById(R.id.imageCoffee);
        imageCoffeeButton.setOnClickListener(this);
        imageTeaButton = findViewById(R.id.imageTea);
        imageTeaButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.imageCoffee:
                Intent intent = new Intent(this, CoffeeList.class);
                startActivity(intent);
                break;
        }
        switch (v.getId()) {
            case R.id.imageTea:
                Intent intent = new Intent(this, TeaTest.class);
                startActivity(intent);
                break;
        }
    }
}

