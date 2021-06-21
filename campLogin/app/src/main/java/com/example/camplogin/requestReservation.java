package com.example.camplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class requestReservation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_reservation);

        Button acceptReservationButton =(Button)findViewById(R.id.acceptReservation);
        Button rejectReservationButton = (Button)findViewById(R.id.rejectReservation);

        ArrayList<Guest> data2 = new ArrayList<>();
        data2.add(new Guest("김수환", "2","2021-05-31","2021-06-01","O"));
        data2.add(new Guest("한정민", "3","2021-06-20","2021-06-21","x"));
        data2.add(new Guest("이기탁", "4","2021-05-25","2021-05-27","O"));
        data2.add(new Guest("이치구", "2","2021-05-31","2021-06-04","x"));
        data2.add(new Guest("최윤제", "3","2021-05-31","2021-06-03","O"));
        data2.add(new Guest("박지성", "3","2021-05-31","2021-06-01","x"));
        data2.add(new Guest("김연아", "2","2021-05-31","2021-06-01","x"));
        data2.add(new Guest("홍길동", "4","2021-05-31","2021-06-01","x"));
        data2.add(new Guest("아이유", "2","2021-05-31","2021-06-01","x"));


        //어댑터
        MySecondAdapter adapter = new MySecondAdapter(data2);

        //뷰
        ListView listView = findViewById(R.id.list_view2);
        listView.setAdapter(adapter);


        //클릭
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(requestReservation.this, position+"번째 아이템 선택", Toast.LENGTH_SHORT).show();
            }
        });



    }
}