package com.example.alex_city;


public class Location {

    private int iamge_resource;
    private String address;
    private String phone_number;
    private String D_name;

    // create two constructor because we have two kind of data one has image and other not
    public Location(int iamge_resource, String address, String phone_number, String d_name) {
        this.iamge_resource = iamge_resource;
        this.address = address;
        this.phone_number = phone_number;
        this.D_name = d_name;
    }

    public Location(String address, String phone_number, String d_name) {
        this.address = address;
        this.phone_number = phone_number;
        D_name = d_name;
    }

    public int getIamge_resource() {
        return iamge_resource;
    }


    public String getAddress() {
        return address;
    }


    public String getPhone_number() {
        return phone_number;
    }


    public String getD_name() {
        return D_name;
    }

}
