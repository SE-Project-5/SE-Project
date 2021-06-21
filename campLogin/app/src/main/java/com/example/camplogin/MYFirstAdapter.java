package com.example.camplogin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MYFirstAdapter extends BaseAdapter {

    private List<Guest> mData;

    public MYFirstAdapter(List<Guest> data){
        this.mData = data;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override//
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_guest, parent, false);

        ImageView guestImage = convertView.findViewById(R.id.guest_image);
        TextView  guestNameText = convertView.findViewById(R.id.guestName_text);
        TextView  numOfGuestText = convertView.findViewById(R.id.numOfGuest_text);
        TextView  startDateText = convertView.findViewById(R.id.startDate_text);
        TextView  endDateText = convertView.findViewById(R.id.endDate_text);

        Guest guest = mData.get(position);
        guestNameText.setText(guest.getGuestName());
        numOfGuestText.setText(guest.getNumOfGuest());
        startDateText.setText(guest.getStartDate());
        endDateText.setText(guest.getEndDate());

        return convertView;
    }
}