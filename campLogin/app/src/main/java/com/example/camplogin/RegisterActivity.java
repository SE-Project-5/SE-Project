package com.example.camplogin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class RegisterActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        final EditText nameText = (EditText)findViewById(R.id.nameText);
        final EditText idText = (EditText)findViewById(R.id.idText);
        final EditText passwordText = (EditText)findViewById(R.id.passwordText);
        final EditText userPnumberText = (EditText)findViewById(R.id.userPnumberText);
        final EditText userBirthText =(EditText)findViewById(R.id.uesrBrithText) ;
        Button hostButton = (Button)findViewById(R.id.hostButton);
        Button signinFinishButton = (Button)findViewById(R.id.signinFinishButton);

        signinFinishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = nameText.getText().toString();
                String userID = idText.getText().toString();
                String userPassword = passwordText.getText().toString();
                String userPnumber = userPnumberText.getText().toString();
                String userBirth = userBirthText.getText().toString();

                if(userName.equals("")||userID.equals("")||userPassword.equals("")||userPnumber.equals("")||userBirth.equals("")){
                    Toast.makeText(getApplicationContext(), "빈 항목을 입력하세요", Toast.LENGTH_LONG).show();
                }
                else{
                    Response.Listener<String> responseListener = new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            JSONObject jsonResponse = null;
                            try {
                                jsonResponse = new JSONObject(response);
                                boolean success = jsonResponse.getBoolean("success");
                                if(success){
                                    AlertDialog.Builder builder =  new AlertDialog.Builder(RegisterActivity.this);
                                    builder.setMessage("회원 등록에 성공했습니다.")
                                            .setPositiveButton("확인",null)
                                            .create()
                                            .show();

                                    Intent signinFinishIntent = new Intent(RegisterActivity.this,LoginActivity.class);
                                    RegisterActivity.this.startActivity(signinFinishIntent);
                                }
                                else{
                                    AlertDialog.Builder builder =  new AlertDialog.Builder(RegisterActivity.this);
                                    builder.setMessage("회원 등록에 실패했습니다.")
                                            .setNegativeButton("다시 시도",null)
                                            .create()
                                            .show();
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    };
                    RegisterRequest registerRequest = new RegisterRequest(userID,userPassword,userPnumber,responseListener);
                    RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
                    queue.add(registerRequest);
                    Intent signInIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                    RegisterActivity.this.startActivity(signInIntent);
                }

            }
        });


        hostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userID = idText.getText().toString();
                String userPassword = passwordText.getText().toString();
                String userPnumber = userPnumberText.getText().toString();
                HostRegisterActivity.setUser(userID,userPassword,userPnumber);
                Intent hostIntent = new Intent(RegisterActivity.this,HostRegisterActivity.class);
                RegisterActivity.this.startActivity(hostIntent);

            }
        });

    }
}