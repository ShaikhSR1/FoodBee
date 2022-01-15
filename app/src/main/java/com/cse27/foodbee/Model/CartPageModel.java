package com.cse27.foodbee.Model;

/**
 * The type Cart page model.
 */
public class CartPageModel implements CartPageModelInterface {
    private String cartFoodName;
    /**
     * The Cart food price value.
     */
    double cartFoodPriceValue, /**
     * The Cart product quantity.
     */
    cartProductQuantity;


    /**
     * this is a setter function
     *
     * @param cartFoodName        the cart food name
     * @param cartFoodPriceValue  the cart food price value
     * @param cartProductQuantity the cart product quantity
     */
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