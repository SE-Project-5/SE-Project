package com.example.camplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class campUpdate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camp_update);
        Button campUpdateButton = (Button)findViewById(R.id.campUpdateButton);
        Button hostLogout = (Button)findViewById(R.id.hostLogoutButton);


        EditText campInfoText =(EditText)findViewById(R.id.campInfoText);
        EditText campNumText =(EditText)findViewById(R.id.campNumText);
        EditText campAddressText =(EditText)findViewById(R.id.campAddressText);
        EditText campPriceText =(EditText)findViewById(R.id.campPriceText);
        EditText campNameText =(EditText)findViewById(R.id.campNameText);
        EditText hostPhoneText =(EditText)findViewById(R.id.hostPhoneText);






        hostLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent logoutIntent = new Intent(campUpdate.this,LoginActivity.class);
                campUpdate.this.startActivity(logoutIntent);

            }
        });

        campUpdateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String campInfo;
                String campNum;
                String campAddress;
                String campPrice;
                String campName;
                String hostPhone;
                campInfo = campInfoText.getText().toString();
                campNum = campNumText.getText().toString();
                campAddress = campAddressText.getText().toString();
                campPrice = campPriceText.getText().toString();
                campName = campNameText.getText().toString();
                hostPhone = hostPhoneText.getText().toString();
                if(campInfo.equals("")||campNum.equals("")||campAddress.equals("")||campPrice.equals("")||campName.equals("")||hostPhone.equals("")){

                    Toast.makeText(campUpdate.this, "빈 내용을 작성 완료 해주세요.", Toast.LENGTH_SHORT).show();

                }
                else{

                    Toast.makeText(campUpdate.this, "업데이트가 완료되었습니다.", Toast.LENGTH_SHORT).show();

                    Intent campUpdateIntent = new Intent(campUpdate.this,HostMainActivity.class);
                    campUpdate.this.startActivity(campUpdateIntent);
                }



            }
        });
    }
}


