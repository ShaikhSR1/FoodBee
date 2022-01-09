package com.cse27.foodbee.Model;

public class CartPageModel implements CartPageModelInterface {
    private String cartFoodName;
    double cartFoodPriceValue, cartProductQuantity;
    private int cartFoodImage;

    public CartPageModel(String cartFoodName, double cartFoodPriceValue, double cartProductQuantity) {
        this.cartFoodName = cartFoodName;
        this.cartFoodPriceValue = cartFoodPriceValue;
        this.cartProductQuantity = cartProductQuantity;
    }

    @Override
    public String getCartFoodName() {
        return cartFoodName;
    }


    @Override
    public double getCartFoodPriceValue() {
        return cartFoodPriceValue;
    }

    @Override
    public double getCartProductQuantity() {
        return cartProductQuantity;
    }

}