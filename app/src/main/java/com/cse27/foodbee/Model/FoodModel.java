package com.cse27.foodbee.Model;

public class FoodModel implements FoodModelInterface{

    private String foodName, foodRating, foodPrice, foodImageUrl;

    public FoodModel(String foodName, String foodRating, String foodPrice, String foodImageUrl) {
        this.foodName = foodName;
        this.foodRating = foodRating;
        this.foodPrice = foodPrice;
        this.foodImageUrl = foodImageUrl;
    }

    @Override
    public String getFoodName() {
        return foodName;
    }

    @Override
    public String getFoodRating() {
        return foodRating;
    }

    @Override
    public String getFoodPrice() {
        return foodPrice;
    }

    @Override
    public String getFoodImageUrl() {
        return foodImageUrl;
    }
}
