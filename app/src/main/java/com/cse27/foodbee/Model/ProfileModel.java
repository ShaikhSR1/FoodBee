package com.cse27.foodbee.Model;

import android.widget.TextView;

public class ProfileModel implements ProfileModelInterface {
    String fullName;
    String address;

    public ProfileModel(){

    }
    public ProfileModel(String fullName, String address) {
        this.fullName = fullName;
        this.address = address;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public String getAddress() {
        return address;
    }
}
