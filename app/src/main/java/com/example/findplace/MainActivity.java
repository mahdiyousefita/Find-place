package com.example.findplace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.findplace.Adapters.ExploreRecyclerViewAdapter;
import com.example.findplace.Fragments.Home.EmotionFragment;
import com.example.findplace.Fragments.Home.InspirationFragment;
import com.example.findplace.Fragments.Home.PlaceFragment;
import com.example.findplace.Fragments.Main.HomeFragment;
import com.example.findplace.Models.ExploreRecyclerViewItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //private TextView textViewPlace, textViewInspiration, textViewEmotions;
    //private RecyclerView recyclerView;

    private ImageButton imageButtonHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        //clickHandler();
    }

    private void init(){
        imageButtonHome = findViewById(R.id.activityMainImageButtonHome);
        addFragment(new HomeFragment());
    }

    private void addFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.activityMainFrameLayout, fragment)
                .commit();
    }






    /*

    private void init(){
        textViewPlace = findViewById(R.id.mainActivityTextViewPlaces);
        textViewInspiration = findViewById(R.id.mainActivityTextViewInspiration);
        textViewEmotions = findViewById(R.id.MainActivityTextViewEmotions);
        addFragment(new PlaceFragment());

        recyclerView = findViewById(R.id.mainActivityRecyclerViewExplore);

        setUpRecyclerViewExplore();
    }

    private void addFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.mainActivityFrameLayoutFirst, fragment)
                .commit();
    }

    private void replaceFragment(Fragment fragment){
        getSupportFragmentManager()
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
            replaceFragment(new EmotionFragment());
            textViewEmotions.setTextColor(getResources().getColor(R.color.black));
            textViewPlace.setTextColor(getResources().getColor(R.color.gray));
            textViewInspiration.setTextColor(getResources().getColor(R.color.gray));
        });
    }

    private void setUpRecyclerViewExplore(){

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        ExploreRecyclerViewAdapter adapter = new ExploreRecyclerViewAdapter(this, getFakeItemsList());
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

     */
}