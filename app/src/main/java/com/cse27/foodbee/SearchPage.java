package com.cse27.foodbee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

/**
 * Search system
 * Searching food and restaurants
 */
public class SearchPage extends AppCompatActivity {

    private String searchQuery = "";

    public SearchPage() {
    }

    public String getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
    }



    /**
     * The Search result.
     */
    SearchResult searchResult;
    /**
     * The Image view return.
     */
    ImageView imageViewReturn;
    /**
     * The Btn search food.
     */
    Button btnSearchFood, /**
     * The Btn search restaurant.
     */
    btnSearchRestaurant;
    /**
     * The Edit text search.
     */
    EditText editTextSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);

        imageViewReturn = (ImageView) findViewById(R.id.imageViewReturn);
        btnSearchRestaurant = (Button) findViewById(R.id.btnSearchRestaurant);
        btnSearchFood = (Button) findViewById(R.id.btnSearchFood);
        editTextSearch = (EditText) findViewById(R.id.editTextSearch);

        setSearchQuery(editTextSearch.toString().trim());


        /**
         * Redirects to search resut
         * Search food or restaurant by tapping food or restaurant button
         * Calls firebaseFoodSearch method from SearchResult class
         * passes parameter queryFood
         */


        btnSearchFood.setOnClickListener(v -> {

            if (isValidQuery(getSearchQuery())==1) {
                Toast.makeText(this,"Please enter food name",Toast.LENGTH_SHORT).show();
            }
            else {
                searchResult.firebaseFoodSearch(getSearchQuery());

                Intent intent = new Intent(SearchPage.this, SearchResult.class);
                startActivity(intent);
            }



        });

        imageViewReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public int isValidQuery(String query) {
        if(query=="") {
            return 1;
        }
        else {
            return 0;
        }
    }



    /*public class SearchResultFromDB extends RecyclerView.ViewHolder {
        View view;
        public SearchResultFromDB(View itemView) {
            super(itemView);
            view = itemView;
        }
    }*/
}