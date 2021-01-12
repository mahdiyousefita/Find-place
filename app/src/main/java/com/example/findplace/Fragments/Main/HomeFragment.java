package com.example.findplace.Fragments.Main;

import android.os.Bundle;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.findplace.Adapters.ExploreRecyclerViewAdapter;
import com.example.findplace.Fragments.Home.SuggestionFragment;
import com.example.findplace.Fragments.Home.InspirationFragment;
import com.example.findplace.Fragments.Home.PlaceFragment;
import com.example.findplace.Models.ExploreRecyclerViewItem;
import com.example.findplace.R;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private TextView textViewPlace, textViewInspiration, textViewEmotions;
    private RecyclerView recyclerView;
    private NavigationView navigationView;
    public DrawerLayout drawerLayout;
    private ImageButton imageButtonDrawerLayout;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_home, container, false);

        init();
        clickHandler();


        setupDrawerLayout();
        return view;
    }

    private void setupDrawerLayout() {
        imageButtonDrawerLayout = view.findViewById(R.id.homeToolbarNavigationDrawerButton);
        navigationView = view.findViewById(R.id.homeFragmentNavigationView);
        drawerLayout = view.findViewById(R.id.homeFragmentDrawerLayout);
        navigationView.bringToFront();
        View viewHeader = navigationView.getHeaderView(0);

        setTextToNavigationViewHeaderName("joeel", viewHeader);

        setOnClickListenerToNavigationViewHeaderImageView(viewHeader);

        setOnClickListenerToButtonDrawerLayout();

        setOnClickListenerToNavigationViewItems();

    }

    public void setTextToNavigationViewHeaderName(String name, View viewHeader){
        TextView textView = viewHeader.findViewById(R.id.homeNavigationTextViewName);
        textView.setText(name);
    }

    public void setOnClickListenerToNavigationViewHeaderImageView(View viewHeader) {
        ImageView imageViewProfile = viewHeader.findViewById(R.id.homeNavigationViewImageViewProfile);
        imageViewProfile.setOnClickListener(v -> {
            Toast.makeText(getActivity(), "Profile", Toast.LENGTH_SHORT).show();
            drawerLayout.closeDrawer(GravityCompat.START);
        });
    }

    private void setOnClickListenerToNavigationViewItems() {
        navigationView.setNavigationItemSelectedListener(item -> {
            int id = item.getItemId();

            switch (id){
                case R.id.navigationViewItemHome:
                    Toast.makeText(getActivity(), "Home", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                    break;
                case R.id.navigationViewItemLikes:
                    Toast.makeText(getActivity(), "Likes", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                    break;
                case R.id.navigationViewItemSettings:
                    Toast.makeText(getActivity(), "Settings", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                    break;
                case R.id.navigationViewItemAboutUs:
                    Toast.makeText(getActivity(), "About us", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                    break;
            }

            return true;
        });
    }

    private void setOnClickListenerToButtonDrawerLayout() {
        imageButtonDrawerLayout.setOnClickListener(v -> {
            if (!(drawerLayout.isDrawerOpen(GravityCompat.START))){
                drawerLayout.openDrawer(GravityCompat.START);
            } else {
                drawerLayout.closeDrawer(GravityCompat.START);
            }
        });
    }

    private void init(){
        textViewPlace = view.findViewById(R.id.mainActivityTextViewPlaces);
        textViewInspiration = view.findViewById(R.id.mainActivityTextViewInspiration);
        textViewEmotions = view.findViewById(R.id.MainActivityTextViewSuggestion);
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

    private void clickHandler(){
        textViewInspiration.setOnClickListener(v -> {
            replaceFragment(new InspirationFragment());
            textViewEmotions.setTextColor(getResources().getColor(R.color.gray));
            textViewPlace.setTextColor(getResources().getColor(R.color.gray));
            textViewInspiration.setTextColor(getResources().getColor(R.color.black));
        });
        textViewPlace.setOnClickListener(v -> {
            replaceFragment(new PlaceFragment());
            textViewEmotions.setTextColor(getResources().getColor(R.color.gray));
            textViewPlace.setTextColor(getResources().getColor(R.color.black));
            textViewInspiration.setTextColor(getResources().getColor(R.color.gray));
        });

        textViewEmotions.setOnClickListener(v -> {
            replaceFragment(new SuggestionFragment());
            textViewEmotions.setTextColor(getResources().getColor(R.color.black));
            textViewPlace.setTextColor(getResources().getColor(R.color.gray));
            textViewInspiration.setTextColor(getResources().getColor(R.color.gray));
        });
    }

    private void setUpRecyclerViewExplore(){

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        ExploreRecyclerViewAdapter adapter = new ExploreRecyclerViewAdapter(getActivity(), getFakeItemsList());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private List<ExploreRecyclerViewItem> getFakeItemsList(){
        List<ExploreRecyclerViewItem> itemList = new ArrayList<>();
        itemList.add(new ExploreRecyclerViewItem("Kayaking", R.drawable.ic_kayak));
        itemList.add(new ExploreRecyclerViewItem("Snorkeling", R.drawable.ic_snorkeling));
        itemList.add(new ExploreRecyclerViewItem("Ballooning", R.drawable.ic_ballooning));
        itemList.add(new ExploreRecyclerViewItem("Hiking", R.drawable.ic_hiking));
        itemList.add(new ExploreRecyclerViewItem("Kayaking", R.drawable.ic_kayak));
        itemList.add(new ExploreRecyclerViewItem("Snorkeling", R.drawable.ic_snorkeling));
        itemList.add(new ExploreRecyclerViewItem("Ballooning", R.drawable.ic_ballooning));
        itemList.add(new ExploreRecyclerViewItem("Hiking", R.drawable.ic_hiking));

        return itemList;
    }

}