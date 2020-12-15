package com.example.findplace.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.findplace.Models.Post;
import com.example.findplace.R;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.zip.Inflater;

import okio.InflaterSource;

public class HomeDiscoverRecycleAdapter extends RecyclerView.Adapter<myViewHolder> {
    private Context context;
    private List<Post> posts;

    public HomeDiscoverRecycleAdapter(Context context, List<Post> posts){
        this.context = context;
        this.posts = posts;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.fragment_place_recycler_view_items, parent, false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        initOnBindViewHolder(holder, position);
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    private void initOnBindViewHolder(myViewHolder holder, int position){
        Post post = posts.get(position);
        holder.textViewPlaceName.setText(post.getPlaceName());
        holder.textViewLocation.setText(post.getLocation());
        holder.imageViewBackground.setImageResource(post.getImageUrl());
        holder.textViewDiscount.setText(post.getDiscount());

    }

}

class myViewHolder extends RecyclerView.ViewHolder{
    public ImageView imageViewBackground;
    public TextView textViewLocation, textViewPlaceName, textViewDiscount;

    public myViewHolder(@NonNull View itemView) {
        super(itemView);
        init(itemView);
    }

    private void init(View itemView){
        imageViewBackground = itemView.findViewById(R.id.fragmentPlaceRecyclerViewItemsImageView);
        textViewLocation = itemView.findViewById(R.id.fragmentPlaceRecyclerViewItemsLocation);
        textViewPlaceName = itemView.findViewById(R.id.fragmentPlaceRecyclerViewItemsPlaceName);
        textViewDiscount = itemView.findViewById(R.id.fragmentPlaceRecyclerViewItemsDiscount);
    }
}
