package com.cse27.foodbee.Recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cse27.foodbee.Model.RestaurantModel;
import com.cse27.foodbee.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * The type Restaurant recycler adapter.
 */
public class RestaurantRecyclerAdapter extends RecyclerView.Adapter<RestaurantRecyclerAdapter.viewHolder> {

    /**
     * The All restaurant.
     */
    List<RestaurantModel> allRestaurant;
    /**
     * The Context.
     */
    Context context;

    /**
     * Instantiates a new Restaurant recycler adapter.
     *
     * @param allRestaurant the all restaurant
     * @param context       the context
     */
    public RestaurantRecyclerAdapter(List<RestaurantModel> allRestaurant, Context context) {
        this.allRestaurant = allRestaurant;
        this.context = context;
    }

    /**
     * Instantiates a new Restaurant recycler adapter.
     *
     * @param allRestaurants the all restaurants
     */
    public RestaurantRecyclerAdapter(List<RestaurantModel> allRestaurants) {
    }

    /**
     * Instantiates a new Restaurant recycler adapter.
     */
    public RestaurantRecyclerAdapter() {
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_restaurant,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        RestaurantModel current = allRestaurant.get(position);
        holder.textViewRestaurantNameCard.setText(current.getRestaurantName());
        holder.textViewRestaurantRatingCard.setText(current.getRestaurantRating());
        Picasso.with(context).load(current.getRestaurantImageUrl()).fit().into(holder.imageRestaurantCard);
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

    /**
     * The type View holder.
     */
    public class viewHolder extends RecyclerView.ViewHolder {

        /**
         * The Image restaurant card.
         */
        ImageView imageRestaurantCard;
        /**
         * The Text view restaurant name card.
         */
        TextView textViewRestaurantNameCard, /**
         * The Text view restaurant rating card.
         */
        textViewRestaurantRatingCard;

        /**
         * Instantiates a new View holder.
         *
         * @param itemView the item view
         */
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageRestaurantCard = itemView.findViewById(R.id.imageRestaurantCard);
            textViewRestaurantNameCard = itemView.findViewById(R.id.textViewRestaurantNameCard);
            textViewRestaurantRatingCard = itemView.findViewById(R.id.textViewRestaurantRatingCard);
        }
    }

}
