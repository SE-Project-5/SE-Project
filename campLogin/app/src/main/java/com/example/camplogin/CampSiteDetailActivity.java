package com.example.camplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class CampSiteDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camp_site_detail);


        Button campReservationButton = (Button)findViewById(R.id.campReservationButton);
        Button campReviewListSearchButton = (Button)findViewById(R.id.campReviewListSearchButton);


        campReservationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent campReservationIntent = new Intent(CampSiteDetailActivity.this,GuestReservationAddActivity.class);
                CampSiteDetailActivity.this.startActivity(campReservationIntent);

            }
        });




        campReviewListSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent campReviewListSearchIntent = new Intent(CampSiteDetailActivity.this,reviewList.class);
                CampSiteDetailActivity.this.startActivity(campReviewListSearchIntent);

            }
        });
    }
}