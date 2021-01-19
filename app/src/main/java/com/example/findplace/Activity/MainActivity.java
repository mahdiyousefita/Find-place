package com.example.findplace.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.widget.ImageButton;
import com.example.findplace.Fragments.Main.HomeFragment;
import com.example.findplace.Fragments.Main.ProfileFragment;
import com.example.findplace.R;

public class MainActivity extends AppCompatActivity {

    private ImageButton imageButtonHome, imageButtonGraph, imageButtonSearch, imageButtonProfile;
    private final int FRAME_LAYOUT = R.id.activityMainFrameLayout;
    private HomeFragment homeFragment;

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
        homeFragment = new HomeFragment();


        addFragment(homeFragment);


        clickHandler();
    }

    private void addFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .add(FRAME_LAYOUT, fragment)
                .commit();
    }

    private void replaceFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(FRAME_LAYOUT, fragment)
                .commit();

    }

    private void clickHandler(){

        imageButtonHome.setOnClickListener(v -> {
            imageButtonHome.setImageResource(R.drawable.ic_home);
            imageButtonGraph.setImageResource(R.drawable.ic_graph_light);
            imageButtonSearch.setImageResource(R.drawable.ic_search_light);
            imageButtonProfile.setImageResource(R.drawable.ic_profile_light);
            homeFragment = new HomeFragment();
            replaceFragment(homeFragment);
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
            replaceFragment(new ProfileFragment());
        });

    }

    @Override
    public void onBackPressed() {
        if (homeFragment.drawerLayout.isDrawerOpen(GravityCompat.START)){
            homeFragment.drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }
}