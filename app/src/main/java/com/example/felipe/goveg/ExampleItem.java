package com.example.felipe.goveg;

public class ExampleItem {
    private String mImage;
    private String mCreator;
    private int mLikes;

    public ExampleItem (String image, String creator, int likes){
        mImage = image;
        mCreator = creator;
        mLikes = likes;
    }

    public String getmImage() {
        return mImage;
    }

    public String getmCreator() {
        return mCreator;
    }

    public int getmLikes() {
        return mLikes;
    }
}
