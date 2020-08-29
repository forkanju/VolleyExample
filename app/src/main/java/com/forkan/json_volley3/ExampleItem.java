package com.forkan.json_volley3;

public class ExampleItem {
    private String mImageUrl;
    private String mCreator;
    private int mLikes;

    public ExampleItem(String mImageUrl, String mCreator, int mLikes) {
        this.mImageUrl = mImageUrl;
        this.mCreator = mCreator;
        this.mLikes = mLikes;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public String getmCreator() {
        return mCreator;
    }

    public int getmLikes() {
        return mLikes;
    }
}

//    public ExampleItem(String mImageUrl, String mCreator, int mLikes){
//        this.mImageUrl = mImageUrl;
//        this.mCreator = mCreator;
//        this.mLikes = mLikes;
//    }
//
//    public String getmImageUrl(){
//        return mImageUrl;
//    }
//
//    public String getmCreator(){
//        return mCreator;
//    }
//
//    public int getmLikes(){
//        return mLikes;
//    }
//}
