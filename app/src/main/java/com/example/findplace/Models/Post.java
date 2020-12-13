package com.example.findplace.Models;

public class Post {
    private String placeName;
    private String location;

    // TODO: change this String ...
    private int imageUrl;

    public Post(String placeName, String location, int imageUrl){
        this.placeName = placeName;
        this.location = location;
        this.imageUrl = imageUrl;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }



}
