package com.cse27.foodbee.Controller;

import com.cse27.foodbee.Model.RestaurantModel;
import com.cse27.foodbee.View.RestaurantViewInterface;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

public class RestaurantController implements RestaurantControllerInterface{

    FirebaseDatabase rootNode;
    DatabaseReference reference;
    FirebaseFirestore foodBee = FirebaseFirestore.getInstance();

    RestaurantViewInterface restaurantView;

    public RestaurantController(RestaurantViewInterface restaurantView) {
        this.restaurantView = restaurantView;
    }

    @Override
    public void restaurantList(String restaurantName, String restaurantRating, String restaurantImageUrl) {
        RestaurantModel restaurantModel = new RestaurantModel(restaurantName, restaurantRating, restaurantImageUrl);
    }




}
