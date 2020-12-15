package com.example.findplace.FakeListItem;

import com.example.findplace.Models.Post;
import com.example.findplace.R;

import java.util.ArrayList;
import java.util.List;

public class FakeList {


    public static List<Post> getFakePosts(){
        List<Post> posts = new ArrayList<>();

        // Todo: sort by most view...
        posts.add(new Post("Yosemite", "Canada, Vancouver", R.drawable.image_place_two, ""));
        posts.add(new Post("Silicon Valley", "USA, San Fransisco", R.drawable.image_place_three, ""));
        posts.add(new Post("Mississippi", "USA, New Orleans", R.drawable.image_place_four, "15%"));
        posts.add(new Post("Yosemite", "Canada, Vancouver", R.drawable.image_place_two, ""));
        posts.add(new Post("Mississippi", "USA, New Orleans", R.drawable.image_place_four, "15"));
        posts.add(new Post("Silicon Valley", "USA, San Fransisco", R.drawable.image_place_three, ""));

        return posts;

    }


    public static List<Post> getFakeInspirationPosts(){
        List<Post> posts = new ArrayList<>();

        // Todo: sort by most discounts...
        posts.add(new Post("Mississippi", "USA, New Orleans", R.drawable.image_place_four, "80%"));
        posts.add(new Post("Yosemite", "Canada, Vancouver", R.drawable.image_place_two, "30%"));
        posts.add(new Post("Silicon Valley", "USA, San Fransisco", R.drawable.image_place_three, "10%"));



        return posts;
    }
}