package com.example.camplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GuestReservationListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_reservation_list);


        Button needreviewButton_1 = (Button)findViewById(R.id.needreviewButton_1);
        Button needreviewButton_2 =(Button)findViewById(R.id.needreviewButton_2);
        Button needreviewButton_3 =(Button)findViewById(R.id.needreviewButton_3);
        Button needReviewModifyButton_1 =(Button)findViewById(R.id.needReviewModifyButton_1);
        Button needReviewModifyButton_2 =(Button)findViewById(R.id.needReviewModifyButton_2);
        Button needReservationModifyButton =(Button)findViewById(R.id.needReservationModifyButton);

        Intent needreviewIntent = new Intent(GuestReservationListActivity.this,ReviewWriteActivity.class);
        Intent needReviewModifyIntent = new Intent(GuestReservationListActivity.this,ReviewModifyActivity.class);

        needreviewButton_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GuestReservationListActivity.this.startActivity(needreviewIntent);

            }
        });
        needreviewButton_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GuestReservationListActivity.this.startActivity(needreviewIntent);

            }
        });needreviewButton_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GuestReservationListActivity.this.startActivity(needreviewIntent);

            }
        });

        needReviewModifyButton_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GuestReservationListActivity.this.startActivity(needReviewModifyIntent);

            }
        });
        needReviewModifyButton_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GuestReservationListActivity.this.startActivity(needReviewModifyIntent);

            }
        });

        needReservationModifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent needReservationModifyIntent = new Intent(GuestReservationListActivity.this,GuestReservationModifyActivity.class);
                GuestReservationListActivity.this.startActivity(needReservationModifyIntent);
            }
        });
    }
}