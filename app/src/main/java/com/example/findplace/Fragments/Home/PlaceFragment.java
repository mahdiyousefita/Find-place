package com.example.findplace.Fragments.Home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.findplace.Adapters.HomeDiscoverRecycleAdapter;
import com.example.findplace.FakeListItem.FakeList;
import com.example.findplace.R;


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
        HomeDiscoverRecycleAdapter adapter = new HomeDiscoverRecycleAdapter(getActivity(), FakeList.getFakePosts());

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

}