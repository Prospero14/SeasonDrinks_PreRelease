package com.amon.seasoncoffee02;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


//основной список кофе
public class LemonadeList extends AppCompatActivity {
    RecyclerView recyclerView;
    private int image;
    private String description;

    public LemonadeList() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lemonadelist);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.lemonadestopmain);

        recyclerView = findViewById(R.id.recycler_view_lemonade);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<LemonadeList> lemonadeLists = new ArrayList<LemonadeList>();
        lemonadeLists.add(new LemonadeList(R.drawable.starbuckslogo, "Лимонад: Ежевичный мохито"));
        lemonadeLists.add(new LemonadeList(R.drawable.starbuckslogo, "Лимонад: Персик-Цитрус"));
        lemonadeLists.add(new LemonadeList(R.drawable.doubleblogo, "Лимонад: Клубника-Личи"));
        lemonadeLists.add(new LemonadeList(R.drawable.doubleblogo, "Лимонад: Манго-Грейпфрут"));
        lemonadeLists.add(new LemonadeList(R.drawable.surfcoffeelogo, "Лимонад: Бернингмэн - роза, клюква, личи"));
        lemonadeLists.add(new LemonadeList(R.drawable.onepricecoffeelogo, "Лимонад: Кофейный"));
        lemonadeLists.add(new LemonadeList(R.drawable.onepricecoffeelogo, "Лимонад: Киви-Фейхоа"));
        lemonadeLists.add(new LemonadeList(R.drawable.onepricecoffeelogo, "Лимонад: Ананас-Бузина"));
        lemonadeLists.add(new LemonadeList(R.drawable.onepricecoffeelogo, "Лимонад: Груша-Кориандр"));
        lemonadeLists.add(new LemonadeList(R.drawable.cofixlogo, "Напиток: Облепиха-Черная смородина"));

        LemonadeListAdapter lemonadeListAdapter = new LemonadeListAdapter(lemonadeLists);
        recyclerView.setAdapter(lemonadeListAdapter);
    }

    public LemonadeList(int image, String description){
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
