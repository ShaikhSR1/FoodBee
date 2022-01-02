package com.cse27.foodbee.Model;

import android.text.TextUtils;
import android.util.Patterns;

public class SignUpModel implements SignUpModelInterface {

    private String fullName,email, phoneNumber, passowrd, confirmPassword;

    public SignUpModel() {

    }

    public SignUpModel(String fullName, String email, String phoneNumber, String password, String confirmPassword) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.passowrd = password;
        this.confirmPassword = confirmPassword ;
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
    public String getPassword() {
        return passowrd;
    }
    @Override
    public String getConfirmPassword() {
        return confirmPassword;
    }

    @Override
    public int isValid() {
        if (TextUtils.isEmpty(getFullName())){
            return 0;
        } else if (TextUtils.isEmpty(getEmail())){
            return 1;
        } else if(!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()){
            return 2;
        } else if (TextUtils.isEmpty(getPhoneNumber())){
            return 3;
        }else if (getPhoneNumber().length()!=11){
            return 4;
        }else if (TextUtils.isEmpty(getPassword())){
            return 5;
        }else if(getPassword().length()<=6){
            return 6;
        }else if(!getPassword().equals(getConfirmPassword())){
            return 7;
        }else {
            return -1;
        }

    }
}
