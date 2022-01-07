package com.cse27.foodbee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cse27.foodbee.Model.FoodModel;
import com.cse27.foodbee.Recycler.FoodRecyclerAdapter;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.squareup.picasso.Picasso;

public class SearchResult extends AppCompatActivity {

    Context context;
    FirebaseFirestore firestoreSearch = FirebaseFirestore.getInstance();
    FoodRecyclerAdapter foodRecyclerAdapter;

    String foodImageUrl, foodName, foodRating, foodPrice;

    ImageView imageFoodCard;
    TextView textViewFoodNameCard, textViewFoodRatingCard, textViewFoodPriceCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        imageFoodCard = findViewById(R.id.imageFoodCard);
        textViewFoodNameCard = findViewById(R.id.textViewFoodNameCard);
        textViewFoodRatingCard = findViewById(R.id.textViewFoodRatingCard);
        textViewFoodPriceCard = findViewById(R.id.textViewFoodPriceCard);



    }


    public void showResults(String url, String name, String rating, String price) {

        Picasso.with(context).load(url).fit().into(imageFoodCard);
        textViewFoodNameCard.setText(name);
        textViewFoodRatingCard.setText(rating);
        textViewFoodPriceCard.setText(price);
    }
}