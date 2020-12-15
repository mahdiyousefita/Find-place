package com.example.findplace.Models;

public class Post {
    private String placeName;
    private String location;
    private String discount;

    // TODO: change this String ...
    private int imageUrl;


    public Post(String placeName, String location, int imageUrl, String discount){
        this.placeName = placeName;
        this.location = location;
        this.imageUrl = imageUrl;
        this.discount = discount;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
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
