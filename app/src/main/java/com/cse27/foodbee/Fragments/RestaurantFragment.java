package com.cse27.foodbee.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cse27.foodbee.Model.RestaurantModel;
import com.cse27.foodbee.R;
import com.cse27.foodbee.Recycler.RestaurantRecyclerAdapter;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;


public class RestaurantFragment extends Fragment {

    RecyclerView recyclerView;
    RestaurantRecyclerAdapter restaurantRecyclerAdapter;
    List<RestaurantModel> allRestaurants = new ArrayList<>();

    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragmet
        View root = inflater.inflate(R.layout.fragment_restaurant, container, false);

        recyclerView = root.findViewById(R.id.restaurantRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        restaurantRecyclerAdapter = new RestaurantRecyclerAdapter(allRestaurants);
        //adapter to recycleview
        recyclerView.setAdapter(restaurantRecyclerAdapter);
        getDataFromFireStore();

        return root;
    }

    private void getDataFromFireStore() {
        FirebaseFirestore firestoreData = FirebaseFirestore.getInstance();
        firestoreData.collection("restaurants")
                .get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                if (task.isSuccessful()) {
                    for (DocumentSnapshot documentSnapshot:task.getResult()) {
                        RestaurantModel restaurants = documentSnapshot.toObject(RestaurantModel.class);
                        allRestaurants.add(restaurants);
                    }
                    restaurantRecyclerAdapter.notifyDataSetChanged();
                }
            }
        });
    }
}