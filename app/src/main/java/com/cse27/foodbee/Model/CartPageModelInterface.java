package com.cse27.foodbee.Model;

/**
 * The interface Cart page model interface.
 */
public interface CartPageModelInterface {
    /**
     * Gets cart food name.
     *
     * @return the cart food name
     */
    public String getCartFoodName();

    /**
     * Gets cart food price value.
     *
     * @return the cart food price value
     */
    public double getCartFoodPriceValue();

    /**
     * Gets cart product quantity.
     *
     * @return the cart product quantity
     */
    public double getCartProductQuantity();
}
