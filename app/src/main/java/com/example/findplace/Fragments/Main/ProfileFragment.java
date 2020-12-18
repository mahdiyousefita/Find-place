package com.example.findplace.Fragments.Main;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.findplace.R;

public class ProfileFragment extends Fragment {
    private View view;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        init(inflater, container);
        return view;
    }

    private void init(LayoutInflater inflater, ViewGroup container){
        view = inflater.inflate(R.layout.fragment_profile, container, false);

    }
}