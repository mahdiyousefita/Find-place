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


public class InspirationFragment extends Fragment {
    private View view;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view  = inflater.inflate(R.layout.fragment_inspiration, container, false);


        init();

        setUpRecyclerView();


        return view;
    }

    private void init(){
        recyclerView = view.findViewById(R.id.fragmentInspirationRecyclerView);
    }


    private void setUpRecyclerView(){

        LinearLayoutManager layoutManager = new LinearLayoutManager(
                getActivity()
                , LinearLayoutManager.HORIZONTAL
                , false
        );

        HomeDiscoverRecycleAdapter adapter = new HomeDiscoverRecycleAdapter(
                getActivity()
                , FakeList.getFakeInspirationPosts()
        );

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}