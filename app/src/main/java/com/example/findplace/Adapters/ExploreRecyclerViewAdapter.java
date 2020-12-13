package com.example.findplace.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.findplace.Models.ExploreRecyclerViewItem;
import com.example.findplace.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ExploreRecyclerViewAdapter extends RecyclerView.Adapter<myExploreRecyclerViewViewHolder> {

    private final Context context;
    private final List<ExploreRecyclerViewItem> itemList;

    public ExploreRecyclerViewAdapter(Context context, List<ExploreRecyclerViewItem> itemList){
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public myExploreRecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(context)
                .inflate(R.layout.activity_main_recycler_view_explore_items, parent, false);

        return new myExploreRecyclerViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myExploreRecyclerViewViewHolder holder, int position) {
        holder.textView.setText(itemList.get(position).getText());
        holder.imageView.setImageResource(itemList.get(position).getImageUrl());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}

class myExploreRecyclerViewViewHolder extends RecyclerView.ViewHolder{

    public ImageView imageView;
    public TextView textView;

    public myExploreRecyclerViewViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.recyclerExploreImageView);
        textView = itemView.findViewById(R.id.recyclerExploreTextView);
    }
}