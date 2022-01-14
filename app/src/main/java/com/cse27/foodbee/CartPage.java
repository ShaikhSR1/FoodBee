package com.cse27.foodbee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.cse27.foodbee.Controller.CartPageShowController;
import com.cse27.foodbee.Controller.CartPageShowControllerInterface;
import com.cse27.foodbee.Model.CartPageModel;
import com.cse27.foodbee.Recycler.CartPageAdapter;
import com.cse27.foodbee.View.CartPageViewInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * this cart page screen will show products in cart that will be ordered
 */

public class CartPage extends AppCompatActivity implements CartPageViewInterface {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    List<CartPageModel> cartProductList;
    ArrayList cartList = new ArrayList<>();
    com.cse27.foodbee.Recycler.CartPageAdapter adapter;
    CartPageShowControllerInterface cartPageShow = new CartPageShowController(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_page);
        cartPageShow.onCartPageShow();
        //cartPageShow.initData();
        initRecylerView();
    }


    /**
     * here is the function to display cart products in recycle view
     */
    private void initRecylerView() {
        recyclerView = findViewById(R.id.cartRecyclerView);
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new CartPageAdapter(cartProductList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    /**
     * this function is for showing that the operation is successful
     * @param foodName
     * @param foodQuantity
     * @param foodPrice
     */

    @Override
    public void onSeeCartSuccess(String foodName, double foodQuantity, double foodPrice) {


    }

    @Override
    public void onSeeCartError() {

    }
}
