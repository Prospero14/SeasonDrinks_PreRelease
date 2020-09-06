package com.amon.seasoncoffee02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton coffeeMainButton;
    ImageButton drinksMainButton;
    ImageButton placesMainButton;
    ImageButton myBestButton;
    ImageButton blogButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.maintop);

        coffeeMainButton = findViewById(R.id.coffeeMain);
        coffeeMainButton.setOnClickListener(this);
        drinksMainButton = findViewById(R.id.drinksMain);
        drinksMainButton.setOnClickListener(this);
        placesMainButton = findViewById(R.id.placesMain);
        placesMainButton.setOnClickListener(this);
        myBestButton = findViewById(R.id.imageMyBest);
        myBestButton.setOnClickListener(this);
        blogButton = findViewById(R.id.blogBtn);
        blogButton.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.coffeeMain:
                Intent intent = new Intent(this, CoffeeList.class);
                startActivity(intent);
                break;
        }
        switch (v.getId()) {
            case R.id.drinksMain:
                Intent intent = new Intent(this, DrinksMainList.class);
                startActivity(intent);
                break;
        }
        switch (v.getId()) {
            case R.id.placesMain:
                Intent intent = new Intent(this, Places.class);
                startActivity(intent);
                break;
        }
        switch (v.getId()) {
            case R.id.imageMyBest:
                Intent intent = new Intent(this, MyBest.class);
                startActivity(intent);
                break;
        }
    }
}



