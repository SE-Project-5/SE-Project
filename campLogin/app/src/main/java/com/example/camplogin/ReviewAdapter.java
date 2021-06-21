package com.example.camplogin;


import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class ReviewAdapter extends BaseAdapter {
    ArrayList<List> lists = new ArrayList<>();

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context c = parent.getContext();
        if (convertView == null) {
            LayoutInflater li = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = li.inflate(R.layout.review_list, parent, false);
        }
        TextView campScoreText = convertView.findViewById(R.id.campScoreText);
        TextView reviewTextView = convertView.findViewById(R.id.reviewTextView);
        ImageView campImageView = convertView.findViewById(R.id.campImageView);

        List l = lists.get(position);
        campScoreText.setText(l.getCampScore());
        reviewTextView.setText(l.getReviewText());
        campImageView.setImageDrawable(l.getReviewImage());

        return convertView;
    }
    public void addList(Drawable reviewImage, String reviewText, String campScore){

        List l = new List();

        l.setReviewImage(reviewImage);
        l.setReviewText(reviewText);
        l.setCampScore(campScore);

        lists.add(l);

    }
}