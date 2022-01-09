package com.cse27.foodbee.Controller;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.cse27.foodbee.Recycler.CartPageAdapter;
import com.cse27.foodbee.Model.CartPageModel;
import com.cse27.foodbee.Model.CartPageModelInterface;

import com.cse27.foodbee.Recycler.CartPageAdapter;
import com.cse27.foodbee.View.CartPageViewInterface;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class CartPageShowController implements CartPageShowControllerInterface{
    CartPageViewInterface cartPageView;
    LinearLayoutManager linearLayoutManager;
    List<CartPageModel> cartProductList;
    CartPageAdapter adapter;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    FirebaseAuth cartPageAuth;
    String userId, nestedCollection, foodId;
    String foodName;
    double foodPrice, foodQuantity;
    FirebaseFirestore foodBee = FirebaseFirestore.getInstance();

    public CartPageShowController(CartPageViewInterface cartPageView) {
        this.cartPageView = cartPageView;
    }

    CartPageModelInterface cartPageModel;
    void initData() {

        cartProductList = new ArrayList<>();

        cartProductList.add(new CartPageModel(foodName,foodPrice,foodQuantity));
    }

    @Override
    public void onCartPageShow() {
        rootNode = FirebaseDatabase.getInstance();
        cartPageAuth = FirebaseAuth.getInstance();
        //userId = updateProfileAuth.getCurrentUser().getUid();
        reference = rootNode.getReference("orderList");
        userId = "12vEmE2aiHW62TwotQfOQv0TgOf2";
        nestedCollection = "01";
        foodId = "burger";

        DocumentReference documentReference = foodBee.collection("orderList").document(userId).collection(nestedCollection).document();
        documentReference.addSnapshotListener((Executor) this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException error) {
                foodName = documentSnapshot.getString("foodName");
                foodPrice = documentSnapshot.getDouble("foodPrice");
                foodQuantity = documentSnapshot.getDouble("foodQuantity");

                initData();

                if(foodName != " ")
                {
                    cartPageView.onSeeCartSuccess(foodName, foodQuantity, foodPrice);
                }
                else{
                    cartPageView.onSeeCartError();
                }

            }
        });

        cartPageModel = new CartPageModel(foodName, foodPrice, foodQuantity);


    }


}
