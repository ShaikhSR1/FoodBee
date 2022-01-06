package com.cse27.foodbee.Model;

public class RestaurantModel implements RestaurantModelInterface{

    private String restaurantName, restaurantRating, restaurantImageUrl;

    public RestaurantModel(String restaurantName, String restaurantRating, String restaurantImageUrl) {
        this.restaurantName = restaurantName;
        this.restaurantRating = restaurantRating;
        this.restaurantImageUrl = restaurantImageUrl;
    }

    @Override
    public String getRestaurantName() {
        return restaurantName;
    }

    @Override
    public String getRestaurantRating() {
        return restaurantRating;
    }

    @Override
    public String getRestaurantImageUrl() {
        return restaurantImageUrl;
    }
}
