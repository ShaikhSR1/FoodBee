package com.cse27.foodbee.View;

public interface ProfileViewInterface {
    void onProfileReloadSuccess(String fullName, String address);
    void onProfileReloadError(String message);
}
