package com.example.admin.googleplaces;

import java.io.Serializable;

/**
 * Created by Admin on 12/10/2017.
 */

public class MyPlace implements Serializable{
    private String name;
    private String address;
    private String phoneNumber;

    public MyPlace(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
