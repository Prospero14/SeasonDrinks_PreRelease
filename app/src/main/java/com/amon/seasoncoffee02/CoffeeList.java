package com.amon.seasoncoffee02;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


//основной список кофе
public class CoffeeList extends AppCompatActivity {
    RecyclerView recyclerView;
    private int image;
    private String description;

    public CoffeeList() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffeeshop);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.coffeesplash);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<CoffeeList> coffeeList = new ArrayList<CoffeeList>();
        coffeeList.add(new CoffeeList(R.drawable.starbuckslogo, "Макиато ванильное облако"));
        coffeeList.add(new CoffeeList(R.drawable.kofenotlatte, "Макиато карамельное облако"));
        coffeeList.add(new CoffeeList(R.drawable.cacao, "Случайный текст для тестирования recyclerview #3."));
        coffeeList.add(new CoffeeList(R.drawable.coffeemaina, "Случайный текст для тестирования recyclerview #4."));
        coffeeList.add(new CoffeeList(R.drawable.dayice, "Случайный текст для тестирования recyclerview #5."));
        coffeeList.add(new CoffeeList(R.drawable.excited, "Случайный текст для тестирования recyclerview #6."));
        coffeeList.add(new CoffeeList(R.drawable.milkshake, "Случайный текст для тестирования recyclerview #7."));
        coffeeList.add(new CoffeeList(R.drawable.milkshake, "Случайный текст для тестирования recyclerview #8."));
        coffeeList.add(new CoffeeList(R.drawable.milkshake, "Случайный текст для тестирования recyclerview #9."));
        coffeeList.add(new CoffeeList(R.drawable.milkshake, "Случайный текст для тестирования recyclerview #10."));

        CoffeeListAdapter coffeeListAdapter = new CoffeeListAdapter(coffeeList);
        recyclerView.setAdapter(coffeeListAdapter);
    }

    public CoffeeList(int image, String description){
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
