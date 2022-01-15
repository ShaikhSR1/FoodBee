package com.cse27.foodbee.Model;

import android.text.TextUtils;
import android.util.Patterns;

/**
 * The type Shipping info model.
 */
public class ShippingInfoModel implements ShippingInfoModelInterface {

    private String fullName,email, phoneNumber,address, optionalNote;

    /**
     * Instantiates a new Shipping info model.
     */
    public ShippingInfoModel() {
    }

    /**
     * Instantiates a new Shipping info model.
     *
     * @param fullName     the full name
     * @param email        the email
     * @param phoneNumber  the phone number
     * @param address      the address
     * @param optionalNote the optional note
     */
    public ShippingInfoModel(String fullName, String email, String phoneNumber, String address, String optionalNote) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.optionalNote = optionalNote;
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
    public String getOptionalNote() {
        return optionalNote;
    }

    @Override
    public int isShippingInfoValid() {
        if (TextUtils.isEmpty(getFullName())){
            return 0;
        } else if (TextUtils.isEmpty(getEmail())){
            return 1;
        } else if(!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()){
            return 2;
        } else if (TextUtils.isEmpty(getPhoneNumber())){
            return 3;
        }else if (getPhoneNumber().length()!=11) {
            return 4;
        }else if(TextUtils.isEmpty(getAddress())){
            return 5;
        }else {
            return -1;
        }
    }
}
