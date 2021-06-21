package com.example.camplogin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        EditText idText = (EditText)findViewById(R.id.idText);
        EditText passwordText = (EditText)findViewById(R.id.passwordText);

        TextView registerButton = (TextView)findViewById(R.id.registerButton);

        Button loginButton = (Button)findViewById(R.id.loginButton);
        Button hostLoginButton = (Button)findViewById((R.id.hostLoginButton));

        Button findIdPwButton = (Button)findViewById(R.id.findIdPwButton);
        AlertDialog.Builder builder =  new AlertDialog.Builder(LoginActivity.this);


        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String id = idText.getText().toString();
                String pw = passwordText.getText().toString();




                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
                }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userId = idText.getText().toString();
                String userPassword = passwordText.getText().toString(); //아이디랑 페스워드를 받아서 보낸다.

                if (userId.equals("") || userPassword.equals("")) {
                    Toast.makeText(getApplicationContext(), "아이디와 패스워드를 입력하세요", Toast.LENGTH_LONG).show();
                }
                else
                {
                    //<userId,userPassword>;
                    Intent loginIntent = new Intent(LoginActivity.this, GuestMainActivity.class);
                    LoginActivity.this.startActivity(loginIntent);
            }
            }
        });

        hostLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userId = idText.getText().toString();
                String userPassword = passwordText.getText().toString(); //아이디랑 페스워드를 받아서 보낸다.

                if (userId.equals("") || userPassword.equals("")) {
                    Toast.makeText(getApplicationContext(), "아이디와 패스워드를 입력하세요", Toast.LENGTH_LONG).show();
                    //입럭하세요 출력
                }
                else {
                    Intent hostLoginIntent = new Intent(LoginActivity.this, HostMainActivity.class);
                    LoginActivity.this.startActivity(hostLoginIntent);
                }
            }
        });

        findIdPwButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent findIdPwIntent= new Intent(LoginActivity.this,FindIdentityActivity.class);
                LoginActivity.this.startActivity(findIdPwIntent);
            }
        });
    }




}