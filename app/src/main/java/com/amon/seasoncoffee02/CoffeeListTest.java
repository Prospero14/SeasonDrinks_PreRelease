package com.amon.seasoncoffee02;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CoffeeListTest extends AppCompatActivity {
    RecyclerView recyclerView;
    private int image;
    private String description;

    public CoffeeListTest() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffeeshop);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.coffeesplash);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<CoffeeListTest> coffeeList = new ArrayList<CoffeeListTest>();
        coffeeList.add(new CoffeeListTest(R.drawable.imagesquare, "Случайный текст для тестирования recyclerview #1."));
        coffeeList.add(new CoffeeListTest(R.drawable.kofenotlatte, "Случайный текст для тестирования recyclerview#2."));
        coffeeList.add(new CoffeeListTest(R.drawable.cacao, "Случайный текст для тестирования recyclerview #3."));
        coffeeList.add(new CoffeeListTest(R.drawable.coffeemaina, "Случайный текст для тестирования recyclerview #4."));
        coffeeList.add(new CoffeeListTest(R.drawable.dayice, "Случайный текст для тестирования recyclerview #5."));
        coffeeList.add(new CoffeeListTest(R.drawable.excited, "Случайный текст для тестирования recyclerview #6."));
        coffeeList.add(new CoffeeListTest(R.drawable.milkshake, "Случайный текст для тестирования recyclerview #7."));

        CoffeeListAdapter coffeeListAdapter = new CoffeeListAdapter(coffeeList);
        recyclerView.setAdapter(coffeeListAdapter);
    }

    public CoffeeListTest (int image, String description){
        this.description = description;
        this.image = image;
    }

    public int getImage() {
        return this.image;
    }

    public String getDescription() {
        return this.description;
    }
}
