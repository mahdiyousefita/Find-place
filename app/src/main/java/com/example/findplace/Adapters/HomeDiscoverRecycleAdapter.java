package com.example.findplace.Adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.findplace.BuyTicketActivity;
import com.example.findplace.MainActivity;
import com.example.findplace.Models.Post;
import com.example.findplace.R;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.zip.Inflater;

import okio.InflaterSource;

public class HomeDiscoverRecycleAdapter extends RecyclerView.Adapter<myViewHolder> {
    private final List<Post> posts;
    private final Activity activity;

    public HomeDiscoverRecycleAdapter(List<Post> posts, Activity activity){
        this.posts = posts;
        this.activity = activity;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.fragment_place_recycler_view_items, parent, false);
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
        holder.cardView.setOnClickListener(v ->{
            Intent intent = new Intent(activity, BuyTicketActivity.class);
            intent.putExtra(BuyTicketActivity.KEY_FOR_PLACE_NAME, post.getPlaceName())
                    .putExtra(BuyTicketActivity.KEY_FOR_DISCOUNT, post.getDiscount())
                    .putExtra(BuyTicketActivity.KEY_FOR_IMAGE_URL, post.getImageUrl())
                    .putExtra(BuyTicketActivity.KEY_FOR_LOCATION, post.getLocation());
            activity.startActivity(intent);
        });

    }

}

class myViewHolder extends RecyclerView.ViewHolder{
    public ImageView imageViewBackground;
    public TextView textViewLocation, textViewPlaceName, textViewDiscount;
    public CardView cardView;

    public myViewHolder(@NonNull View itemView) {
        super(itemView);
        init(itemView);
    }

    private void init(View itemView){
        imageViewBackground = itemView.findViewById(R.id.fragmentPlaceRecyclerViewItemsImageView);
        textViewLocation = itemView.findViewById(R.id.fragmentPlaceRecyclerViewItemsLocation);
        textViewPlaceName = itemView.findViewById(R.id.fragmentPlaceRecyclerViewItemsPlaceName);
        textViewDiscount = itemView.findViewById(R.id.fragmentPlaceRecyclerViewItemsDiscount);
        cardView = itemView.findViewById(R.id.fragmentPlaceRecyclerViewItemsCardView);
    }
}
