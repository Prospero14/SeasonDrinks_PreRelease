package com.amon.seasoncoffee02;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CoffeeListAdapter extends RecyclerView.Adapter<CoffeeListAdapter.CoffeeListViewHolder> {
    ArrayList<CoffeeListTest> coffeelist;

    public CoffeeListAdapter(ArrayList<CoffeeListTest> coffeeslist){
        this.coffeelist = coffeeslist;
    }

    @NonNull
    @Override
    public CoffeeListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.formforcoffeelist, parent, false);
        return new CoffeeListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CoffeeListViewHolder holder, int position) {
        holder.imageForCoffeeList.setImageResource(coffeelist.get(position).getImage());
        holder.textForCoffeeList.setText(coffeelist.get(position).getDescription());

    }

    @Override
    public int getItemCount() {
        return coffeelist.size();
    }

    public class CoffeeListViewHolder extends RecyclerView.ViewHolder{
        ImageView imageForCoffeeList;
        TextView textForCoffeeList;
        public CoffeeListViewHolder (View view){
            super (view);
            imageForCoffeeList = view.findViewById(R.id.imageForCoffeeList);
            textForCoffeeList = view.findViewById(R.id.textForCoffeeList);
        }
    }
}
