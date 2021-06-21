package com.example.camplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class reservationList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_list);

        ArrayList<Guest> data = new ArrayList<>();
        data.add(new Guest("이기탁", "2","2021-05-31","2021-06-01"));
        data.add(new Guest("이기순", "3","2021-06-20","2021-06-21"));
        data.add(new Guest("이기자", "4","2021-05-25","2021-05-27"));
        data.add(new Guest("이기환", "2","2021-05-31","2021-06-04"));
        data.add(new Guest("이기구", "3","2021-05-31","2021-06-03"));
        data.add(new Guest("이기민", "3","2021-05-31","2021-06-01"));
        data.add(new Guest("이기윤", "2","2021-05-31","2021-06-01"));
        data.add(new Guest("이기틱", "4","2021-05-31","2021-06-01"));
        data.add(new Guest("이기톡", "2","2021-05-31","2021-06-01"));






        //어댑터
        MYFirstAdapter adapter = new MYFirstAdapter(data);

        //뷰
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);


        //클릭
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(reservationList.this, position+1+"번째 캠핑장 선택", Toast.LENGTH_SHORT).show();
            }
        });
    }
}