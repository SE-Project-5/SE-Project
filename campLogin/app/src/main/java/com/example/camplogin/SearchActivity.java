package com.example.camplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Spinner spinner1 = (Spinner)findViewById(R.id.spinner1);
        Spinner spinner2 = (Spinner)findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner)findViewById(R.id.spinner3);
        Spinner spinner4 = (Spinner)findViewById(R.id.spinner4);

        //스피너로부터 받아온 값 저장
        String location = spinner1.getSelectedItem().toString();
        String day = spinner2.getSelectedItem().toString();
        String month = spinner3.getSelectedItem().toString();
        String peopleNum = spinner4.getSelectedItem().toString();


        Button campListSearchButton = (Button)findViewById(R.id.campListSearchButton);


        campListSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent campListSearchIntent = new Intent(SearchActivity.this,SearchResultActivity.class);
                SearchActivity.this.startActivity(campListSearchIntent);

            }
        });


    }
}
