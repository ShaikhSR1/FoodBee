package com.cse27.foodbee.Model;

import android.text.TextUtils;
import android.util.Patterns;

import androidx.core.util.PatternsCompat;

/**
 * The type Update profile model.
 */
public class UpdateProfileModel implements UpdateProfileModelInterface {

    private String fullName,email, phoneNumber,address, passowrd;

    /**
     * Instantiates a new Update profile model.
     */
    public UpdateProfileModel(){

    }

    /**
     * Instantiates a new Update profile model.
     *
     * @param fullName    the full name
     * @param email       the email
     * @param phoneNumber the phone number
     * @param address     the address
     * @param password    the password
     */
    public UpdateProfileModel(String fullName, String email, String phoneNumber, String address, String password) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.passowrd = password;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getPassword() {
        return passowrd;
    }

    /**
     * this Method will check validity of given information by user
     * @return an integer value
     */

public int isValid() {
        if (getFullName() == ""){
            return 0;
        } else if (getEmail() == ""){
            return 1;
        } else if(!PatternsCompat.EMAIL_ADDRESS.matcher(getEmail()).matches()){
            return 2;
        } else if (getPhoneNumber() == ""){
            return 3;
        }else if (getPhoneNumber().length() != 11){
            return 4;
        }else if(getAddress() == ""){
            return 5;
        }else if (getPassword() == ""){
            return 6;
        }else if(getPassword().length() < 6) {
            return 7;
        }else {
            return 8;
        }
    }
}
