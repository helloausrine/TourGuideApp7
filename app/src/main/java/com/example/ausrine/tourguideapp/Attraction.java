package com.example.ausrine.tourguideapp;

public class Attraction {

    private int mAttractionName;
    private int mAttractionDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Attraction(int AttractionName, int AttractionDescription, int imageResourceId) {
        mAttractionName = AttractionName;
        mAttractionDescription = AttractionDescription;
        mImageResourceId = imageResourceId;
    }

    public int getTitleAttraction() {
        return mAttractionName;
    }

    public int getDescriptionAttraction() {
        return mAttractionDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}