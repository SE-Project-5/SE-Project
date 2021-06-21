package com.example.camplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SearchResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);



        Button campDetailButton_1 = (Button)findViewById(R.id.campDetailButton_1);
        Button campDetailButton_2 = (Button)findViewById(R.id.campDetailButton_2);
        Button campDetailButton_3 = (Button)findViewById(R.id.campDetailButton_3);
        Button campDetailButton_4 = (Button)findViewById(R.id.campDetailButton_4);
        Button campDetailButton_5 = (Button)findViewById(R.id.campDetailButton_5);
        Button campDetailButton_6 = (Button)findViewById(R.id.campDetailButton_6);

        campDetailButton_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent campDetailIntent = new Intent(SearchResultActivity.this,CampSiteDetailActivity.class);
                SearchResultActivity.this.startActivity(campDetailIntent);

            }
        });
        campDetailButton_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent campDetailIntent = new Intent(SearchResultActivity.this,CampSiteDetailActivity.class);
                SearchResultActivity.this.startActivity(campDetailIntent);

            }
        });
        campDetailButton_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent campDetailIntent = new Intent(SearchResultActivity.this,CampSiteDetailActivity.class);
                SearchResultActivity.this.startActivity(campDetailIntent);

            }
        });
        campDetailButton_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent campDetailIntent = new Intent(SearchResultActivity.this,CampSiteDetailActivity.class);
                SearchResultActivity.this.startActivity(campDetailIntent);

            }
        });
        campDetailButton_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent campDetailIntent = new Intent(SearchResultActivity.this,CampSiteDetailActivity.class);
                SearchResultActivity.this.startActivity(campDetailIntent);

            }
        });
        campDetailButton_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent campDetailIntent = new Intent(SearchResultActivity.this,CampSiteDetailActivity.class);
                SearchResultActivity.this.startActivity(campDetailIntent);

            }
        });

    }



}