package com.example.camplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FindIdentityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_identity);


        Button findIdButton = (Button)findViewById(R.id.findIdButton);
        Button findPWButton =(Button)findViewById(R.id.findPWButton);

        EditText findNameText =(EditText)findViewById(R.id.findNameText);
        EditText findPhoneText_1 =(EditText)findViewById(R.id.findPhoneText_1);
        EditText findIdText =(EditText)findViewById(R.id.findIdText);
        EditText findPhoneText_2 =(EditText)findViewById(R.id.findPhoneText_2);


        findIdButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String userName = findNameText.getText().toString();
                String userPhonenum = findPhoneText_1.getText().toString();

                if(userName.equals("")||userPhonenum.equals("")){
                    Toast.makeText(FindIdentityActivity.this, "이름과 번호를 다 입력하세요", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(FindIdentityActivity.this, "ID : handsomehan", Toast.LENGTH_SHORT).show();

            }
        });


        findPWButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String userId = findIdText.getText().toString();
                String userPhonenum = findPhoneText_2.getText().toString();

                if(userId.equals("")||userPhonenum.equals("")){
                    Toast.makeText(FindIdentityActivity.this, "아이디와 번호를 다 입력하세요", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(FindIdentityActivity.this, "PW : 123456", Toast.LENGTH_SHORT).show();

            }
        });

    }
}