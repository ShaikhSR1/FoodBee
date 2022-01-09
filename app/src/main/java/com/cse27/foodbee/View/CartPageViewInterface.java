package com.cse27.foodbee.View;

public interface CartPageViewInterface {
    void onSeeCartSuccess(String foodName, double foodQuantity, double foodPrice);
    void onSeeCartError();
}
