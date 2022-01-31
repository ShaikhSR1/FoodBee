package com.cse27.foodbee.Controller;

import com.cse27.foodbee.Model.FoodModel;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

/**
 * Connection to firebase
 */

public class FoodController implements FoodControllerInterface{


    FirebaseDatabase rootNode;
    DatabaseReference reference;
    FirebaseFirestore foodBee = FirebaseFirestore.getInstance();

    FoodControllerInterface foodView;

    public FoodController(FoodControllerInterface foodView) {
        this.foodView = foodView;
    }

    @Override
    public void foodList(String foodName, String foodRating, String foodPrice, String foodImageUrl) {
        FoodModel foodModel = new FoodModel(foodName, foodRating, foodPrice, foodImageUrl);
    }
}
