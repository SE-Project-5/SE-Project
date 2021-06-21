package com.example.camplogin;

public class Guest {
    private String guestName;
    private String numOfGuest;
    private String startDate;
    private String endDate;
    private String modified;

    public Guest(String guestName, String numOfGuest, String startDate, String endDate) {
        this.guestName = guestName;
        this.numOfGuest = numOfGuest;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Guest(String guestName,String numOfGuest, String startDate, String endDate, String modified){
        this.guestName = guestName;
        this.endDate = endDate;
        this.numOfGuest = numOfGuest;
        this.startDate = startDate;
        this.modified=modified;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getNumOfGuest() {
        return numOfGuest;
    }

    public void setNumOfGuest(String numOfGuest) {
        this.numOfGuest = numOfGuest;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guestName='" + guestName + '\'' +
                ", numOfGuest='" + numOfGuest + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}