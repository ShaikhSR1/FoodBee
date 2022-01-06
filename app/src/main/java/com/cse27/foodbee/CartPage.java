package com.cse27.foodbee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class CartPage extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    List<CartModelClass> cartProductList;
    CartPageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_page);

        initData();
        initRecylerView();
    }

    private void initData() {

        cartProductList = new ArrayList<>();

        cartProductList.add(new CartModelClass(R.drawable.bbq_burger,"BBQ Burger","Unit Price","250","1"));
    }

    private void initRecylerView() {
        recyclerView = findViewById(R.id.recyclerView);
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new CartPageAdapter(cartProductList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }


}