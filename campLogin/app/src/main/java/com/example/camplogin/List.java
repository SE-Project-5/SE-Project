package com.example.camplogin;


import android.graphics.drawable.Drawable;

public class List {
    private Drawable reviewImage;
    private String reviewText;
    private String campScore;



    public Drawable getReviewImage() {
        return reviewImage;
    }

    public void setReviewImage(Drawable reviewImage) {
        this.reviewImage = reviewImage;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public String getCampScore() {
        return campScore;
    }

    public void setCampScore(String campScore) {
        this.campScore = campScore;
    }

    @Override
    public String toString() {
        return "List{" +
                "reviewImage='" + reviewImage + '\'' +
                ", reviewText='" + reviewText + '\'' +
                ", campScore=" + campScore +
                '}';
    }

}