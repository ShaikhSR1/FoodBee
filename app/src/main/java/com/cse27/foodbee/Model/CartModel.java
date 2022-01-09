package com.cse27.foodbee.Model;

public class CartModel {

    private int cartFoodImage;
    private String cartFoodName;
    private String cartFoodPrice;
    private String cartFoodPriceValue;
    private String cartProductQuantity;

    public CartModel() {
    }

    public CartModel(int cartFoodImage, String cartFoodName, String cartFoodPrice, String cartFoodPriceValue, String cartProductQuantity){

        this.cartFoodImage = cartFoodImage;
        this.cartFoodName = cartFoodName;
        this.cartFoodPrice = cartFoodPrice;
        this.cartFoodPriceValue = cartFoodPriceValue;
        this.cartProductQuantity = cartProductQuantity;
    }


    public String getCartFoodName() {
        return cartFoodName;
    }

    public String getCartFoodPrice() {
        return cartFoodPrice;
    }

    public String getCartFoodPriceValue() {
        return cartFoodPriceValue;
    }

    public String getCartProductQuantity() {
        return cartProductQuantity;
    }

    public int getCartFoodImage() {
        return cartFoodImage;
    }
}
