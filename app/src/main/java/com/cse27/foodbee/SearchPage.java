package com.cse27.foodbee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

public class SearchPage extends AppCompatActivity {

    SearchResult searchResult;

    Button btnSearchFood;
    EditText editTextSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);

        btnSearchFood = findViewById(R.id.btnSearchFood);
        editTextSearch = findViewById(R.id.editTextSearch);

        btnSearchFood.setOnClickListener(v -> {

            Intent intent = new Intent(SearchPage.this, SearchResult.class);
            startActivity(intent);
            //searchResult.firebaseFoodSearch(/*editTextSearch.toString()*/);
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