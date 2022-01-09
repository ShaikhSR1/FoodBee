package com.cse27.foodbee.Recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cse27.foodbee.Model.CartModel;
import com.cse27.foodbee.R;

import java.util.List;

public class CartPageAdapter extends RecyclerView.Adapter<CartPageAdapter.ViewHolder> {


    private List<CartModel> cartProductList;

    public CartPageAdapter(List<CartModel> cartProductList){
        this.cartProductList = cartProductList;
    }

    public CartPageAdapter() {
    }

    @NonNull
    @Override
    public CartPageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cart_page,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartPageAdapter.ViewHolder holder, int position) {

        int cartImage = cartProductList.get(position).getCartFoodImage();
        String foodName = cartProductList.get(position).getCartFoodName();
        String foodUnit = cartProductList.get(position).getCartFoodPrice();
        String foodUnitValue = cartProductList.get(position).getCartFoodPriceValue();
        String foodQuantity = cartProductList.get(position).getCartProductQuantity();

        holder.setData(cartImage,foodName,foodUnit,foodUnitValue,foodQuantity);

    }

    @Override
    public int getItemCount() {
        return cartProductList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView cartFoodImage;
        private TextView cartFoodName;
        private TextView cartFoodPrice;
        private TextView cartFoodPriceValue;
        private TextView cartFoodQuantity;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cartFoodImage = itemView.findViewById(R.id.cartFoodImage);
            cartFoodName = itemView.findViewById(R.id.cartFoodName);
            cartFoodPrice = itemView.findViewById(R.id.cartFoodPrice);
            cartFoodPriceValue = itemView.findViewById(R.id.cartFoodPriceValue);
            cartFoodQuantity = itemView.findViewById(R.id.cartProductQuantity);
        }

        public void setData(int cartImage, String foodName, String foodUnit, String foodUnitValue, String foodQuantity) {

            cartFoodImage.setImageResource(cartImage);
            cartFoodName.setText(foodName);
            cartFoodPrice.setText(foodUnit);
            cartFoodPriceValue.setText(foodUnitValue);
            cartFoodQuantity.setText(foodQuantity);

        }
    }
}
