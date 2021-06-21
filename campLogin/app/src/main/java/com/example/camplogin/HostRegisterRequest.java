package com.example.camplogin;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class HostRegisterRequest extends StringRequest {

    private Map<String,String> parameters;

    public HostRegisterRequest(String hostID, String hostPassword , String hostPnumber, String businessNumber, Response.Listener<String>listener){

        super(Method.POST,URL,listener,null);
        parameters = new HashMap<>();
        parameters.put("host ID",hostID);
        parameters.put("host Password",hostPassword);
        parameters.put("host Phonenumber",hostPnumber);
        parameters.put("host BusinessNumber",businessNumber);
    }



}
