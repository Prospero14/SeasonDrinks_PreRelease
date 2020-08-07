package com.amon.seasoncoffee02;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LemonadeListAdapter extends RecyclerView.Adapter<LemonadeListAdapter.LemonadeListViewHolder> {
    ArrayList<LemonadeList> lemonadelist;

    public LemonadeListAdapter(ArrayList<LemonadeList> lemonadeslist){
        this.lemonadelist = lemonadeslist;
    }

    @NonNull
    @Override
    public LemonadeListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.formforlemonadelist, parent, false);
        return new LemonadeListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LemonadeListViewHolder holder, int position) {
        holder.imageForLemonadeList.setImageResource(lemonadelist.get(position).getImage());
        holder.textForLemonadeList.setText(lemonadelist.get(position).getDescription());

    }

    @Override
    public int getItemCount() {
        return lemonadelist.size();
    }

    public class LemonadeListViewHolder extends RecyclerView.ViewHolder{
        ImageView imageForLemonadeList;
        TextView textForLemonadeList;
        public LemonadeListViewHolder (View view){
            super (view);
            imageForLemonadeList = view.findViewById(R.id.imageForLemonadeList);
            textForLemonadeList = view.findViewById(R.id.textForLemonadeList);
        }
    }
}
