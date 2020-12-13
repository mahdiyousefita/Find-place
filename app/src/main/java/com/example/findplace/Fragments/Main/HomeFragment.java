package com.example.findplace.Fragments.Main;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.findplace.Fragments.Home.PlaceFragment;
import com.example.findplace.R;

public class HomeFragment extends Fragment {
    private TextView textViewPlace, textViewInspiration, textViewEmotions;
    private RecyclerView recyclerView;

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_home, container, false);
        return view;
    }


    private void init(){
        textViewPlace = view.findViewById(R.id.mainActivityTextViewPlaces);
        textViewInspiration = view.findViewById(R.id.mainActivityTextViewInspiration);
        textViewEmotions = view.findViewById(R.id.MainActivityTextViewEmotions);
        addFragment(new PlaceFragment());

        recyclerView = view.findViewById(R.id.mainActivityRecyclerViewExplore);

        setUpRecyclerViewExplore();
    }

    private void addFragment(Fragment fragment){
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.mainActivityFrameLayoutFirst, fragment)
                .commit();
    }

    private void replaceFragment(Fragment fragment){
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.mainActivityFrameLayoutFirst, fragment)
                .commit();
    }

    private void setUpRecyclerViewExplore(){
        //Todo
    }
}