package com.example.findplace.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.findplace.R;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class VIewPagerBuyAdapter extends RecyclerView.Adapter<VIewPagerBuyAdapter.ViewHolder> {

    List<Integer> imageIDS = new ArrayList<>();

    public VIewPagerBuyAdapter(List<Integer> imageIDS) {
        this.imageIDS = imageIDS;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_pager_items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(imageIDS.get(position));
    }

    @Override
    public int getItemCount() {
        return imageIDS.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageViewViewPagerBuy);
        }
    }
}
