package com.cse27.foodbee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

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
    FirebaseFirestore firestoreSearch = FirebaseFirestore.getInstance();
    Button btnSearchFood;
    EditText editTextSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);

        btnSearchFood = findViewById(R.id.btnSearchFood);
        editTextSearch = findViewById(R.id.editTextSearch);

        btnSearchFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseUserSearch();
            }
        });
    }

    private void firebaseUserSearch() {
        firestoreSearch.collection("foods")
                .get()
                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                        for (QueryDocumentSnapshot documents : queryDocumentSnapshots) {
                            if(documents.getString("type")==editTextSearch.toString()) {
                                searchResult.showResults(documents.getString("imageurl"), documents.getString("name"), documents.getString("rating"), documents.getString("price"));
                            }
                        }
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