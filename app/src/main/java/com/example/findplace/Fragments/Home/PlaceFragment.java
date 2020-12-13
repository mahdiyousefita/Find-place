package com.example.findplace.Fragments.Home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.findplace.Adapters.PlaceRecycleAdapter;
import com.example.findplace.Models.Post;
import com.example.findplace.R;

import java.util.ArrayList;
import java.util.List;


public class PlaceFragment extends Fragment {
    private View view;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_place, container, false);
        init();
        setUpRecyclerView();
        return view;
    }

    private void init(){
        recyclerView = view.findViewById(R.id.fragmentPlaceRecyclerView);
    }

    private void setUpRecyclerView(){

        //LinearLayoutManager layoutManager = ;
        PlaceRecycleAdapter adapter = new PlaceRecycleAdapter(getActivity(), getFakePosts());

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private List<Post> getFakePosts(){
        List<Post> posts = new ArrayList<>();

        posts.add(new Post("Yosemite", "Canada, Vancouver", R.drawable.image_place_two));
        posts.add(new Post("Silicon Valley", "USA, San Fransisco", R.drawable.image_place_three));
        posts.add(new Post("Mississippi", "USA, New Orleans", R.drawable.image_place_four));
        posts.add(new Post("Yosemite", "Canada, Vancouver", R.drawable.image_place_two));
        posts.add(new Post("Silicon Valley", "USA, San Fransisco", R.drawable.image_place_three));
        posts.add(new Post("Mississippi", "USA, New Orleans", R.drawable.image_place_four));

        return posts;
    }
}