package com.amon.seasoncoffee02;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TeaListAdapter extends RecyclerView.Adapter<TeaListAdapter.TeaListViewHolder> {
    ArrayList<TeaList> teaList;

    public TeaListAdapter(ArrayList<TeaList> teaLists){
        this.teaList = teaLists;
    }

    @NonNull
    @Override
    public TeaListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.formfortealist, parent, false);
        return new TeaListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeaListViewHolder holder, int position) {
        holder.imageForTeaList.setImageResource(teaList.get(position).getImage());
        holder.textForTeaList.setText(teaList.get(position).getDescription());

    }

    @Override
    public int getItemCount() {
        return teaList.size();
    }

    public class TeaListViewHolder extends RecyclerView.ViewHolder{
        ImageView imageForTeaList;
        TextView textForTeaList;
        public TeaListViewHolder (View view){
            super (view);
            imageForTeaList = view.findViewById(R.id.imageForLemonadeList);
            textForTeaList = view.findViewById(R.id.textForLemonadeList);
        }
    }
}
