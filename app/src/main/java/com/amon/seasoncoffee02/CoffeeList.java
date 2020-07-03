package com.amon.seasoncoffee02;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CoffeeList extends AppCompatActivity implements View.OnClickListener {

    ImageButton imageButton4Button;
    ImageButton imageButton5Button;
    ImageButton imageButton6Button;
    ImageButton imageButton8Button;
    ImageButton imageButton9Button;
    ImageButton oblakokaramelbtn;
    ImageButton instagrambtn;
    ImageButton mapbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coffeelist);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.toplogotop);

        imageButton4Button = findViewById(R.id.imageButton4);
        imageButton4Button.setOnClickListener(this);
        imageButton5Button = findViewById(R.id.imageButton5);
        imageButton5Button.setOnClickListener(this);
        imageButton6Button = findViewById(R.id.imageButton6);
        imageButton6Button.setOnClickListener(this);
        imageButton8Button = findViewById(R.id.imageButton8);
        imageButton8Button.setOnClickListener(this);
        imageButton9Button = findViewById(R.id.imageButton9);
        imageButton9Button.setOnClickListener(this);
        oblakokaramelbtn = findViewById(R.id.karameloblakomakkiato);
        oblakokaramelbtn.setOnClickListener(this);
        instagrambtn = findViewById(R.id.instagramButt);
        instagrambtn.setOnClickListener(this);
        mapbtn = findViewById(R.id.map);
        mapbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.map:
                Intent intent = new Intent(this, Places.class);
                startActivity(intent);
                break;
        }
        switch (v.getId()) {
            case R.id.instagramButt:
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/starbucksrussia/"));
                startActivity(myIntent);
                break;
        }

        switch (v.getId()) {
            case R.id.imageButton4:
                ImageView imageView = findViewById(R.id.imageView15);
                imageView.setImageResource(R.drawable.karamoblakomakkiato);
                Toast.makeText(getBaseContext(),"Starbucks", Toast.LENGTH_SHORT).show();
                break;
        }
        switch (v.getId()) {
            case R.id.imageButton5:
                ImageView imageView = findViewById(R.id.imageView15);
                imageView.setImageResource(R.drawable.kofenotlatte);
                Toast.makeText(getBaseContext(),"Starbucks", Toast.LENGTH_SHORT).show();
                break;
        }  switch (v.getId()) {
            case R.id.imageButton6:
                ImageView imageView = findViewById(R.id.imageView15);
                imageView.setImageResource(R.drawable.kofejoja);
                Toast.makeText(getBaseContext(),"Starbucks", Toast.LENGTH_SHORT).show();
                break;
        }
        switch (v.getId()) {
            case R.id.imageButton8:
                ImageView imageView = findViewById(R.id.imageView15);
                imageView.setImageResource(R.drawable.kofelala);
                Toast.makeText(getBaseContext(),"ДаблБи", Toast.LENGTH_SHORT).show();
                break;
        }
        switch (v.getId()) {
            case R.id.imageButton9:
                ImageView imageView = findViewById(R.id.imageView15);
                imageView.setImageResource(R.drawable.oblkaramel);
                Toast.makeText(getBaseContext(),"Bloom n Brew", Toast.LENGTH_SHORT).show();
                break;
        }
        switch (v.getId()) {
            case R.id.karameloblakomakkiato:
                ImageView imageView = findViewById(R.id.imageView15);
                imageView.setImageResource(R.drawable.oblkaramel);
                Toast.makeText(getBaseContext(),"Bloom n Brew", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
