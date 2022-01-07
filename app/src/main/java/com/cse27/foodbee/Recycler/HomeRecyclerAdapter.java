package com.cse27.foodbee.Recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cse27.foodbee.Model.RestaurantModel;
import com.cse27.foodbee.R;

import java.util.List;

public class HomeRecyclerAdapter extends RecyclerView.Adapter<HomeRecyclerAdapter.viewHolder> {

    List<RestaurantModel> allRestaurant;

    public HomeRecyclerAdapter(List<RestaurantModel> allRestaurant) {
        this.allRestaurant = allRestaurant;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_recycler,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        RestaurantModel current = allRestaurant.get(position);
        holder.textViewRestaurantNameCard.setText(current.getRestaurantName());
        holder.textViewRestaurantRatingCard.setText(current.getRestaurantRating());

    }

    @Override
    public int getItemCount() {
        if (allRestaurant==null || allRestaurant.size()==0) {
            return 0;
        }
        else {
            return allRestaurant.size();
        }
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView imageRestaurantCard;
        TextView textViewRestaurantNameCard, textViewRestaurantRatingCard;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageRestaurantCard = itemView.findViewById(R.id.imageRestaurantCard);
            textViewRestaurantNameCard = itemView.findViewById(R.id.textViewRestaurantNameCard);
            textViewRestaurantRatingCard = itemView.findViewById(R.id.textViewRestaurantRatingCard);
        }
    }

}
