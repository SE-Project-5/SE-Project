package com.example.camplogin;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class RegisterRequest extends StringRequest {
  //  final static private String URL =;
    private Map<String,String> parameters;

    public RegisterRequest(String userID, String userPassword, String userPnumber , Response.Listener<String>listener){

        super(Method.POST,URL,listener,null);
        parameters = new HashMap<>();
        parameters.put("user ID",userID);
        parameters.put("user Password",userPassword);
        parameters.put("user Phonenumber",userPnumber);
    }

}
