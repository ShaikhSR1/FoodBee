package com.cse27.foodbee;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.cse27.foodbee.Model.FoodModel;
import com.cse27.foodbee.Recycler.FoodRecyclerAdapter;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Shows search result using recycler view
 * This page uses FoodRecyclerAdapter class for showing results of searched food
 */

public class SearchResult extends AppCompatActivity {

    Context context;
    FirebaseFirestore firestoreSearch = FirebaseFirestore.getInstance();
    RecyclerView recyclerView;
    FoodRecyclerAdapter foodRecyclerAdapter = new FoodRecyclerAdapter();
    List<FoodModel> allFoods = new ArrayList<>();
    String TAG = "Search";

    String foodImageUrl, foodName, foodRating, foodPrice;

    ImageView imageFoodCard;
    TextView textViewFoodNameCard, textViewFoodRatingCard, textViewFoodPriceCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        /*imageFoodCard = findViewById(R.id.imageFoodCard);
        textViewFoodNameCard = findViewById(R.id.textViewFoodNameCard);
        textViewFoodRatingCard = findViewById(R.id.textViewFoodRatingCard);
        textViewFoodPriceCard = findViewById(R.id.textViewFoodPriceCard);*/

        recyclerView = findViewById(R.id.searchFoodRecylerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(foodRecyclerAdapter);



    }


   /* public void showResults(String url, String name, String rating, String price) {

        Picasso.with(context).load(url).fit().into(imageFoodCard);
        textViewFoodNameCard.setText(name);
        textViewFoodRatingCard.setText(rating);
        textViewFoodPriceCard.setText(price);
    }*/


    /**
     * Fetches data from firestore collection "foods" according to queryFood from SearchPage
     * @param queryFood
     */

    public void firebaseFoodSearch(String queryFood) {

        firestoreSearch.collection("foods")
                .whereEqualTo("type", true)
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @SuppressLint("NotifyDataSetChanged")
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot queryDocumentSnapshot : task.getResult()) {
                                String typeFood = queryDocumentSnapshot.getString("type");
                                if (typeFood.equals(queryFood)) {
                                    FoodModel foods = queryDocumentSnapshot.toObject(FoodModel.class);
                                    allFoods.add(foods);
                                }
                            }
                            foodRecyclerAdapter.notifyDataSetChanged();

                        }
                    }
                });
    }

 /*       firestoreSearch.collection("foods")
                .get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                if (task.isSuccessful()) {

                    for (QueryDocumentSnapshot queryDocumentSnapshot:task.getResult()) {
                        if(queryDocumentSnapshot.getString("type")=="burger") {
                            FoodModel foodModel = queryDocumentSnapshot.toObject(FoodModel.class);
                            allFoods.add(foodModel);
                            Log.e(TAG, "Can't add from firestore");
                        }
                        foodRecyclerAdapter.notifyDataSetChanged();
                    }
                }
            }
        });
*/

        /*firestoreSearch.collection("foods")
                .get()
                .addOnSuccessListener(queryDocumentSnapshots -> {

                    for (QueryDocumentSnapshot documents : queryDocumentSnapshots) {
                        if(Objects.equals(documents.getString("type"), "burger")) {
                            showResults(documents.getString("imageurl"), documents.getString("name"), documents.getString("rating"), documents.getString("price"));
                        }
                    }
                });
    }*/





}