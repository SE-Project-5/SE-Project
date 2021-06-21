package com.example.camplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HostRegisterActivity extends AppCompatActivity {
    static String hostID;
    static String hostPassword;
    static String hostPnumber;
    public static void setUser(String userID, String userPassword, String userPnumber){
        hostID = userID;
        hostPassword =userPassword;
        hostPnumber = userPnumber;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host_register);


        EditText businessnumberText = (EditText)findViewById(R.id.businessnumberText);

        Button hostRegisterButton = (Button)findViewById(R.id.hostRegisterButton);


        hostRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent hostRegisterIntent = new Intent(HostRegisterActivity.this,LoginActivity.class);
                HostRegisterActivity.this.startActivity(hostRegisterIntent);
            }
        });













    }
}