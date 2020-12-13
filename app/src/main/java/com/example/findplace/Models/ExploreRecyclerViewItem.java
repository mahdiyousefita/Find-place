package com.example.findplace.Models;

public class ExploreRecyclerViewItem {

    private String text;
    private int imageUrl;   // TODO: change this to String ...


    public ExploreRecyclerViewItem(String text, int imageUrl){
        this.text = text;
        this.imageUrl = imageUrl;
    }

    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }


}
