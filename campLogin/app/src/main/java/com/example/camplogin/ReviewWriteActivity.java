package com.example.camplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class ReviewWriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_write);


        ImageButton reviewImagePlusButton = (ImageButton)findViewById(R.id.reviewImagePlusButton);
        ImageButton reviewImageDeleteButton = (ImageButton)findViewById(R.id.reviewImageDeleteButton);

        Button reviewFinishButton =(Button)findViewById(R.id.reviewFinishButton);


        EditText reviewWriteText =(EditText)findViewById(R.id.reviewWriteText);
        EditText campScoreText = (EditText)findViewById(R.id.campScoreText);

        reviewFinishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reviewFinishIntent = new Intent(ReviewWriteActivity.this,GuestMainActivity.class);
                ReviewWriteActivity.this.startActivity(reviewFinishIntent);
            }
        });


    }
}