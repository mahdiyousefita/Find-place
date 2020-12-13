package com.example.findplace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.widget.ImageButton;
import com.example.findplace.Fragments.Main.HomeFragment;

public class MainActivity extends AppCompatActivity {

    private ImageButton imageButtonHome, imageButtonGraph, imageButtonSearch, imageButtonProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        imageButtonHome = findViewById(R.id.activityMainImageButtonHome);
        imageButtonGraph = findViewById(R.id.activityMainImageButtonGraph);
        imageButtonSearch = findViewById(R.id.activityMainImageButtonSearch);
        imageButtonProfile = findViewById(R.id.activityMainImageButtonProfile);


        addFragment(new HomeFragment());


        clickHandler();
    }

    private void addFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.activityMainFrameLayout, fragment)
                .commit();
    }

    private void replaceFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.mainActivityFrameLayoutFirst, fragment)
                .commit();

    }

    private void clickHandler(){

        imageButtonHome.setOnClickListener(v -> {
            imageButtonHome.setImageResource(R.drawable.ic_home);
            imageButtonGraph.setImageResource(R.drawable.ic_graph_light);
            imageButtonSearch.setImageResource(R.drawable.ic_search_light);
            imageButtonProfile.setImageResource(R.drawable.ic_profile_light);
        });
        imageButtonGraph.setOnClickListener(v -> {
            imageButtonHome.setImageResource(R.drawable.ic_home_light);
            imageButtonGraph.setImageResource(R.drawable.ic_graph);
            imageButtonSearch.setImageResource(R.drawable.ic_search_light);
            imageButtonProfile.setImageResource(R.drawable.ic_profile_light);
        });
        imageButtonSearch.setOnClickListener(v -> {
            imageButtonHome.setImageResource(R.drawable.ic_home_light);
            imageButtonGraph.setImageResource(R.drawable.ic_graph_light);
            imageButtonSearch.setImageResource(R.drawable.ic_search);
            imageButtonProfile.setImageResource(R.drawable.ic_profile_light);
        });
        imageButtonProfile.setOnClickListener(v -> {
            imageButtonHome.setImageResource(R.drawable.ic_home_light);
            imageButtonGraph.setImageResource(R.drawable.ic_graph_light);
            imageButtonSearch.setImageResource(R.drawable.ic_search_light);
            imageButtonProfile.setImageResource(R.drawable.ic_profile);
        });

    }

}