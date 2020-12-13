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
            imageButtonHome.setImageResource(R.drawable.);
        });

    }

}