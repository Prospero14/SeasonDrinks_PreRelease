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
        getSupportActionBar().setIcon(R.drawable.mainteatop);

        recyclerView = findViewById(R.id.recycler_view_tea);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<TeaList> teaLists = new ArrayList<TeaList>();
        teaLists.add(new TeaList(R.drawable.surfcoffeelogo, "Матча лас фальяс - зеленый чай, тоник, розмарин и апельсин"));
        teaLists.add(new TeaList(R.drawable.nordcoffeelogo, "Холодные капитаны - холодные чайные напитки (С чем? - секрет!)"));
        teaLists.add(new TeaList(R.drawable.nordcoffeelogo, "Холодный жасминовый чай с комбучей"));
        teaLists.add(new TeaList(R.drawable.doubleblogo, "Чай вишня-гибискус опционально со льдом"));
        teaLists.add(new TeaList(R.drawable.doubleblogo, "Холодный чай лаванда - базилик"));
        teaLists.add(new TeaList(R.drawable.onepricecoffeelogo, "Айс матча с грушей"));
        teaLists.add(new TeaList(R.drawable.cofixlogo, "Капучино мандариновое печенье"));
        teaLists.add(new TeaList(R.drawable.cofixlogo, "Капучино клубника-банан"));
        teaLists.add(new TeaList(R.drawable.cofixlogo, "Капучино дыня"));
        teaLists.add(new TeaList(R.drawable.cofixlogo, "Капучино апельсин"));
        teaLists.add(new TeaList(R.drawable.shocologo, "Прованс - лаванда, чай анчан, фреш грейпфрута, сахарный сироп, вода с газом, грейпфрут"));
        teaLists.add(new TeaList(R.drawable.shocologo, "Чай марроканский - Апельсин, лайм, корица, тростниковый сахар и мята"));


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
