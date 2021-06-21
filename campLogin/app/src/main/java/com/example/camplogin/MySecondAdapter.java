package com.example.camplogin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MySecondAdapter extends BaseAdapter {

    private List<Guest> gData;

    public MySecondAdapter(List<Guest> data){
        this.gData = data;
    }

    @Override
    public int getCount() {
        return gData.size();
    }

    @Override
    public Object getItem(int position) {
        return gData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override//
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.request_list, parent, false);

        TextView guestNameText = convertView.findViewById(R.id.guestName_text2);
        TextView  numOfGuestText = convertView.findViewById(R.id.numOfGuest_text2);
        TextView  startDateText = convertView.findViewById(R.id.startDate_text2);
        TextView  endDateText = convertView.findViewById(R.id.endDate_text2);
        TextView modifiedText = convertView.findViewById(R.id.modified_text2);

        Guest guest = gData.get(position);
        guestNameText.setText(guest.getGuestName());
        numOfGuestText.setText(guest.getNumOfGuest());
        startDateText.setText(guest.getStartDate());
        endDateText.setText(guest.getEndDate());
        modifiedText.setText(guest.getModified());

        return convertView;
    }
}