package com.example.camplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ReviewModifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_modify);

        Button reviewModifyFinishButton = (Button)findViewById(R.id.reviewModifyFinishButton);
        Button reviewDeleteButton =(Button)findViewById(R.id.reviewDeleteButton);


        EditText campScoreModifyText =(EditText)findViewById(R.id.campScoreModifyText);
        EditText reviewModifyText = (EditText)findViewById(R.id.reviewModifyText);

        reviewModifyFinishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reviewModifyFinishIntent = new Intent(ReviewModifyActivity.this,GuestMainActivity.class);
                ReviewModifyActivity.this.startActivity(reviewModifyFinishIntent);

            }
        });


        reviewDeleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reviewDeleteIntent = new Intent(ReviewModifyActivity.this,GuestMainActivity.class);
                ReviewModifyActivity.this.startActivity(reviewDeleteIntent);
            }
        });



    }
}