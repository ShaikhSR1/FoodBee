package com.cse27.foodbee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

/**
 * Search system
 * Searching food and restaurants
 */

public class SearchPage extends AppCompatActivity {

    SearchResult searchResult;
    ImageView imageViewReturn;
    Button btnSearchFood, btnSearchRestaurant;
    EditText editTextSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);

        imageViewReturn = (ImageView) findViewById(R.id.imageViewReturn);
        btnSearchRestaurant = (Button) findViewById(R.id.btnSearchRestaurant);
        btnSearchFood = (Button) findViewById(R.id.btnSearchFood);
        editTextSearch = (EditText) findViewById(R.id.editTextSearch);


        /**
         * Redirects to search resut
         * Search food or restaurant by tapping food or restaurant button
         * Calls firebaseFoodSearch method from SearchResult class
         * passes parameter queryFood
         */


        btnSearchFood.setOnClickListener(v -> {

            Intent intent = new Intent(SearchPage.this, SearchResult.class);
            startActivity(intent);
            searchResult.firebaseFoodSearch(editTextSearch.toString());
        });

        imageViewReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }



    /*public class SearchResultFromDB extends RecyclerView.ViewHolder {
        View view;
        public SearchResultFromDB(View itemView) {
            super(itemView);
            view = itemView;
        }
    }*/
}