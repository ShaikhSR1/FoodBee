package com.cse27.foodbee.Model;

import android.text.TextUtils;
import android.util.Patterns;

import java.util.regex.Pattern;

public class LoginModel implements LoginModelInterface{
    private String email,password;

    /**
     * Constructor
     */

    public LoginModel() {
    }

    /**
     * constructor
     * @param email
     * @param password
     */

    public LoginModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

    /**
     * returns email
     * @return
     */

    @Override
    public String getEmail() {
        return email;
    }

    /**
     * return password
     * @return
     */

    @Override
    public String getPassword() {
        return password;
    }

    /**
     * checks validity
     * @return
     */

    @Override
    public int isLoginValid() {
        if (TextUtils.isEmpty(getEmail())){
            return 0;
        }else if (!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()) {
            return 1;

        }else if (TextUtils.isEmpty(getPassword())){
            return 2;

        }else if (getPassword().length()<=6){
            return 3;
        }else
            return 9;
    }
}
