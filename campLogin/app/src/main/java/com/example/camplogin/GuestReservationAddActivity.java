package com.example.camplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GuestReservationAddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_reservation_add);


        Button reservationButton =(Button)findViewById(R.id.reservationAddButton);

        reservationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent reservationIntent = new Intent(GuestReservationAddActivity.this,GuestReservationCreditActivity.class);
                GuestReservationAddActivity.this.startActivity(reservationIntent);
            }
        });
    }
}