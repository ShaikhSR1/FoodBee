package com.cse27.foodbee.Recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cse27.foodbee.Model.FoodModel;
import com.cse27.foodbee.R;
import com.squareup.picasso.Picasso;


import java.util.List;

public class FoodRecyclerAdapter extends RecyclerView.Adapter<FoodRecyclerAdapter.viewHolder> {
    List<FoodModel> allFood;
    Context context;

    public FoodRecyclerAdapter(List<FoodModel> allFood, Context context) {
        this.allFood = allFood;
        this.context = context;
    }

    public FoodRecyclerAdapter() {

    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_food,parent,false);
        return new viewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        FoodModel current = allFood.get(position);
        holder.textViewFoodNameCard.setText(current.getFoodName());
        holder.textViewFoodRatingCard.setText(current.getFoodRating());
        holder.textViewFoodPriceCard.setText(current.getFoodPrice());
        Picasso.with(context).load(current.getFoodImageUrl()).fit().into(holder.imageFoodCard);

    }

    @Override
    public int getItemCount() {
        if (allFood==null || allFood.size()==0) {
            return 0;
        }
        else {
            return allFood.size();
        }
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView imageFoodCard;
        TextView textViewFoodNameCard, textViewFoodRatingCard, textViewFoodPriceCard;
        Button btnAddToCart;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageFoodCard = itemView.findViewById(R.id.imageRestaurantCard);
            textViewFoodNameCard = itemView.findViewById(R.id.textViewRestaurantNameCard);
            textViewFoodRatingCard = itemView.findViewById(R.id.textViewRestaurantRatingCard);
            textViewFoodPriceCard = itemView.findViewById(R.id.textViewFoodPriceCard);
            btnAddToCart = itemView.findViewById(R.id.btnAddToCart);

        }
    }

}
