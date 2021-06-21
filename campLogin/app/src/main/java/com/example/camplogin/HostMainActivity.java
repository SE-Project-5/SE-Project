package com.example.camplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class HostMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host_main);

        Button campInfo = (Button) findViewById(R.id.campInfoButton);
        campInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent campInfoIntent = new Intent(HostMainActivity.this, campUpdate.class);
                HostMainActivity.this.startActivity(campInfoIntent);

            }
        });


        Button appliedReservationList = (Button) findViewById(R.id.reservationListButton);
        appliedReservationList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent appliedReservationListIntent = new Intent(HostMainActivity.this, reservationList.class);
                HostMainActivity.this.startActivity(appliedReservationListIntent);

            }
        });

        Button requestReservationList = (Button) findViewById(R.id.requestReservationButton);
        requestReservationList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent requestReservationListIntent = new Intent(HostMainActivity.this, requestReservation.class);
                HostMainActivity.this.startActivity(requestReservationListIntent);

            }
        });


    }

}





