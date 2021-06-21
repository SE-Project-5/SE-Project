package com.example.camplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GuestMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_main);
        String userID;

        Button campsearchButton = (Button)findViewById(R.id.campsearchButton);
        Button logoutButton =(Button)findViewById(R.id.hostLogoutButton);
        Button guestReservationViewButton = (Button)findViewById(R.id.guestReservationViewButton);


        logoutButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

                Intent logoutIntent = new Intent(GuestMainActivity.this,LoginActivity.class);
                GuestMainActivity.this.startActivity(logoutIntent);
            }
        });

        guestReservationViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent guestReservationIntent =  new Intent(GuestMainActivity.this,GuestReservationListActivity.class);
                GuestMainActivity.this.startActivity(guestReservationIntent);
            }
        });

        campsearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent campserchIntent =  new Intent(GuestMainActivity.this,SearchActivity.class);
                GuestMainActivity.this.startActivity(campserchIntent);
            }
        });
    }
}