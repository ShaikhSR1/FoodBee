package com.cse27.foodbee.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cse27.foodbee.Model.FoodModel;
import com.cse27.foodbee.Model.RestaurantModel;
import com.cse27.foodbee.R;
import com.cse27.foodbee.Recycler.FoodRecyclerAdapter;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

/**
 * Recycler view used to show foods from database
 */

public class FoodFragment extends Fragment {

    RecyclerView recyclerView;
    FoodRecyclerAdapter foodRecyclerAdapter;
    List<FoodModel> allFoods = new ArrayList<>();


    public FoodFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_food, container, false);

        recyclerView = root.findViewById(R.id.foodRecylerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //adapter to recycleview
        recyclerView.setAdapter(foodRecyclerAdapter);
        getDataFromFireStore();

        return root;
    }

    /**
     * Connection to firestore and fetching data
     */


    private void getDataFromFireStore() {
        FirebaseFirestore firestoreData = FirebaseFirestore.getInstance();
        firestoreData.collection("restaurants")
                .get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                if (task.isSuccessful()) {
                    for (DocumentSnapshot documentSnapshot:task.getResult()) {
                        FoodModel foods = documentSnapshot.toObject(FoodModel.class);
                        allFoods.add(foods);
                    }
                    foodRecyclerAdapter.notifyDataSetChanged();
                }
            }
        });
    }
}