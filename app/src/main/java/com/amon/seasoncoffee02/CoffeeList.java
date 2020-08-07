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
        getSupportActionBar().setIcon(R.drawable.coffeetop);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<CoffeeList> coffeeList = new ArrayList<CoffeeList>();
        coffeeList.add(new CoffeeList(R.drawable.starbuckslogo, "Макиато ванильное облако"));
        coffeeList.add(new CoffeeList(R.drawable.starbuckslogo, "Макиато карамельное облако"));
        coffeeList.add(new CoffeeList(R.drawable.starbuckslogo, "Колд брю"));
        coffeeList.add(new CoffeeList(R.drawable.starbuckslogo, "Колд брю латте"));
        coffeeList.add(new CoffeeList(R.drawable.surfcoffeelogo, "Хэппи - холи - персиковый молочно-кофейный вкус с клубникой и сафлор"));
        coffeeList.add(new CoffeeList(R.drawable.nordcoffeelogo, "Холодный кофе с комбучей"));
        coffeeList.add(new CoffeeList(R.drawable.nordcoffeelogo, "Охлажденный кофе со сгущенным кокосовым молоком"));
        coffeeList.add(new CoffeeList(R.drawable.doubleblogo, "Латте - клубника-базилик опционально со льдом"));
        coffeeList.add(new CoffeeList(R.drawable.doubleblogo, "Латте груша-тимьян опционально со льдом"));
        coffeeList.add(new CoffeeList(R.drawable.doubleblogo, "Латте мята-белый шоколад"));
        coffeeList.add(new CoffeeList(R.drawable.onepricecoffeelogo, "Кафе бамбл (эспрессо, апельсиновый сок, карамельный сироп и лед)"));
        coffeeList.add(new CoffeeList(R.drawable.onepricecoffeelogo, "Айс-кофе апельсин-можжевельник"));
        coffeeList.add(new CoffeeList(R.drawable.shocologo, "Тайский кофе - мороженое, молоко, кокосовая паста, сгущенное молоко"));

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
