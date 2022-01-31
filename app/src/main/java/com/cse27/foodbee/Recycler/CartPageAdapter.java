package com.cse27.foodbee.Recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cse27.foodbee.Model.CartPageModel;
import com.cse27.foodbee.R;
import java.util.List;

/**
 * shows ordered foods using recycle view
 */


public class CartPageAdapter extends RecyclerView.Adapter<CartPageAdapter.ViewHolder> {


    private List<CartPageModel> cartProductList;

    /**
     * Instantiates a new Cart page adapter.
     *
     * @param cartProductList the cart product list
     */
    public CartPageAdapter(List<CartPageModel> cartProductList){
        this.cartProductList = cartProductList;
    }


    @NonNull
    @Override
    public CartPageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cart_page,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartPageAdapter.ViewHolder holder, int position) {

        //int cartImage = cartProductList.get(position).getCartFoodImage();
        String foodName = cartProductList.get(position).getCartFoodName();
        double foodUnitValue = cartProductList.get(position).getCartFoodPriceValue();
        double foodQuantity = cartProductList.get(position).getCartProductQuantity();

        holder.setData(foodName,foodUnitValue,foodQuantity);

    }

    /**
     * this function count the number of foods that is ordered and
     * @return an integer value
     */

    @Override
    public int getItemCount() {
        return cartProductList.size();
    }

    /**
     * The type View holder.
     */
    public class ViewHolder extends RecyclerView.ViewHolder {

        //private ImageView cartFoodImage;
        private TextView cartFoodName;
        private TextView cartFoodPriceValue;
        private TextView cartFoodQuantity;


        /**
         * Instantiates a new View holder.
         *
         * @param itemView the item view
         */
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //cartFoodImage = itemView.findViewById(R.id.cartFoodImage);
            cartFoodName = itemView.findViewById(R.id.cartFoodName);
            cartFoodPriceValue = itemView.findViewById(R.id.cartFoodPriceValue);
            cartFoodQuantity = itemView.findViewById(R.id.cartProductQuantity);
        }

        /**
         * Sets data.
         *
         * @param foodName      the food name
         * @param foodUnitValue the food unit value
         * @param foodQuantity  the food quantity
         */
        public void setData( String foodName, double foodUnitValue,double foodQuantity) {

            //cartFoodImage.setImageResource(cartImage);
            cartFoodName.setText(foodName);
            cartFoodPriceValue.setText((int) foodUnitValue);
            cartFoodQuantity.setText((int) foodQuantity);

        }
    }
}
