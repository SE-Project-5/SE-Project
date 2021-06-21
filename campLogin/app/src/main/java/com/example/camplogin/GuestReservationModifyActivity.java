package com.example.camplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


public class GuestReservationModifyActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_reservation_modify);

        Button reservationCancelButton =(Button)findViewById(R.id.reservationCancelButton);
        Button reservationModifyButton = (Button)findViewById(R.id.reservationModifyButton);

        Spinner spinner = (Spinner)findViewById(R.id.campUseNumber);
        String text = spinner.getSelectedItem().toString();
        int numInt = Integer.parseInt(text); //문자열을 숫자로
        numInt *=10000;
        String numStr2 = String.valueOf(numInt); //다시 문자열로 변환
        TextView test1; // 선언


        // id 매핑
        test1= (TextView)findViewById(R.id.price);
        // 텍스트 set
        test1.setText(numStr2);

        reservationCancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent reservationCancelIntent = new Intent(GuestReservationModifyActivity.this,GuestMainActivity.class);
                GuestReservationModifyActivity.this.startActivity(reservationCancelIntent);

            }
        });

        reservationModifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent reservationModifyIntent = new Intent(GuestReservationModifyActivity.this,GuestMainActivity.class);
                GuestReservationModifyActivity.this.startActivity(reservationModifyIntent);

            }
        });


    }
}



