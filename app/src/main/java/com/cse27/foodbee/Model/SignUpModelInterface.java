package com.cse27.foodbee.Model;

public interface SignUpModelInterface {

    String getFullName();
    String getEmail();
    String getPhoneNumber();
    String getPassword();
    String getConfirmPassword();
    int isSignUpValid();

}
