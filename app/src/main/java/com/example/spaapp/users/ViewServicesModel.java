package com.example.spaapp.users;

public class ViewServicesModel {
    private int mImageResource;
    private String mText1;
    public ViewServicesModel(int imageResource, String text1) {
        mImageResource = imageResource;
        mText1 = text1;

    }
    public int getImageResource() {
        return mImageResource;
    }
    public String getText1() {
        return mText1;
    }

}
