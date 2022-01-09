package com.cse27.foodbee.Fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.cse27.foodbee.CartPage;
import com.cse27.foodbee.Profile;
import com.cse27.foodbee.R;

import java.util.Objects;


/**
 * Home page of the app
 */

public class HomeFragment extends Fragment {

    ImageView imageViewCart, imageViewProfile;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        imageViewCart = root.findViewById(R.id.imageViewCart);
        imageViewProfile = root.findViewById(R.id.imageViewProfile);

        imageViewProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Profile.class);
                startActivity(intent);
                ((Activity) requireActivity()).overridePendingTransition(0, 0);
            }
        });

        imageViewCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CartPage.class);
                startActivity(intent);
                ((Activity) getActivity()).overridePendingTransition(0, 0);
            }
        });

        return root;
    }


}