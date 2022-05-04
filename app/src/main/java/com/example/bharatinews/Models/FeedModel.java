package com.example.bharatinews.Models;

public class FeedModel {

    public static final int LAYOUT_ONE = 1;
    public static final int LAYOUT_TWO = 2;
    public static final int LAYOUT_THREE = 3;

    private final int viewType;
    private String message;
    private int image;

    public FeedModel(int viewType, String message) {
        this.viewType = viewType;
        this.message = message;
    }

    public FeedModel(int viewType, String message, int image) {
        this.viewType = viewType;
        this.message = message;
        this.image = image;
    }

    public int getViewType() {
        return viewType;
    }

    public String getMessage() {
        return message;
    }

    public int getImage() {
        return image;
    }
}
