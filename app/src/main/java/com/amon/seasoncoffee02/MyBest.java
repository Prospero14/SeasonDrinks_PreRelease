package com.amon.seasoncoffee02;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MyBest  extends AppCompatActivity  implements View.OnClickListener{

    ImageButton instaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.mytop);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.toplogotop);

        instaButton = findViewById(R.id.instaButt);
        instaButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.instaButt:
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/seasondrinks_moscow/"));
                startActivity(intent);
                break;
        }

    }
}