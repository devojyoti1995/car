package com.example.Car.Model;

public class Reservation {
    private String customername;
    private String address;
    private String pincode;
    private String mobnum;
    private String email;
    private String issuedate;
    private String returndate;

    public Reservation() {
    }

    public Reservation(String customername, String address, String pincode, String mobnum, String email, String issuedate, String returndate) {
        this.customername = customername;
        this.address = address;
        this.pincode = pincode;
        this.mobnum = mobnum;
        this.email = email;
        this.issuedate = issuedate;
        this.returndate = returndate;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getMobnum() {
        return mobnum;
    }

    public void setMobnum(String mobnum) {
        this.mobnum = mobnum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(String issuedate) {
        this.issuedate = issuedate;
    }

    public String getReturndate() {
        return returndate;
    }

    public void setReturndate(String returndate) {
        this.returndate = returndate;
    }
}
