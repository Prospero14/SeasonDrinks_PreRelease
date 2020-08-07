package com.amon.seasoncoffee02;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


//основной список кофе
public class TeaList extends AppCompatActivity {
    RecyclerView recyclerView;
    private int image;
    private String description;

    public TeaList() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tealist);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.coffeesplash);

        recyclerView = findViewById(R.id.recycler_view_tea);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<TeaList> teaLists = new ArrayList<TeaList>();
        teaLists.add(new TeaList(R.drawable.imagesquare, "Случайный текст для тестирования списка чая #1."));
        teaLists.add(new TeaList(R.drawable.kofenotlatte, "Случайный текст для тестирования списка чая#2."));
        teaLists.add(new TeaList(R.drawable.cacao, "Случайный текст для тестирования списка чая #3."));
        teaLists.add(new TeaList(R.drawable.coffeemaina, "Случайный текст для тестирования списка чая #4."));
        teaLists.add(new TeaList(R.drawable.dayice, "Случайный текст для тестирования списка чая #5."));
        teaLists.add(new TeaList(R.drawable.excited, "Случайный текст для тестирования списка чая #6."));
        teaLists.add(new TeaList(R.drawable.milkshake, "Случайный текст для тестирования списка чая #7."));
        teaLists.add(new TeaList(R.drawable.milkshake, "Случайный текст для тестирования списка чая #8."));
        teaLists.add(new TeaList(R.drawable.milkshake, "Случайный текст для тестирования списка чая #9."));
        teaLists.add(new TeaList(R.drawable.milkshake, "Случайный текст для тестирования списка чая #10."));

        TeaListAdapter teaListAdapter = new TeaListAdapter(teaLists);
        recyclerView.setAdapter(teaListAdapter);
    }

    public TeaList(int image, String description){
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
