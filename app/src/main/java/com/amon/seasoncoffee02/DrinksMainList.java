package com.amon.seasoncoffee02;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


import androidx.appcompat.app.AppCompatActivity;
//основной список напитков
public class DrinksMainList extends AppCompatActivity implements View.OnClickListener {
    ImageButton imageTeaButton;
    ImageButton imageLemonadeButton;
    ImageButton imageContactButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coffeemain);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.lemonadestopmain);


        imageTeaButton = findViewById(R.id.imageTea);
        imageTeaButton.setOnClickListener(this);
        imageLemonadeButton = findViewById(R.id.imageLemonade);
        imageLemonadeButton.setOnClickListener(this);
        imageContactButton = findViewById(R.id.imageContact);
        imageContactButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.imageContact:
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/seasondrinks_moscow/"));
                startActivity(intent);
                break;
        }
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

