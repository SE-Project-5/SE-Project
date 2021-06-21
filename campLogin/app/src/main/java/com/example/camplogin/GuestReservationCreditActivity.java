package com.example.camplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GuestReservationCreditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_reservation_credit);


        Button payFinishButton = (Button)findViewById(R.id.payFinishButton);

        payFinishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent payFinishIntent = new Intent(GuestReservationCreditActivity.this,GuestMainActivity.class);
                GuestReservationCreditActivity.this.startActivity(payFinishIntent);
            }
        });
    }



}