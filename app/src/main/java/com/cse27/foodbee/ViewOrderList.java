package com.cse27.foodbee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.cse27.foodbee.Controller.CartPageShowController;
import com.cse27.foodbee.Controller.CartPageShowControllerInterface;
import com.cse27.foodbee.Controller.OrderListController;
import com.cse27.foodbee.Controller.OrderListControllerInterface;
import com.cse27.foodbee.Model.CartPageModel;
import com.cse27.foodbee.Model.OrderListModel;
import com.cse27.foodbee.Recycler.CartPageAdapter;
import com.cse27.foodbee.Recycler.OrderListAdapter;
import com.cse27.foodbee.View.OrderListViewInterface;
import com.google.firebase.Timestamp;

import java.util.ArrayList;
import java.util.List;

/**
 * The type View order list.
 */
public class ViewOrderList extends AppCompatActivity implements OrderListViewInterface {

    /**
     * The Home button.
     */
    Button homeButton;

    /**
     * The Recycler view.
     */
    RecyclerView recyclerView;
    /**
     * The Linear layout manager.
     */
    LinearLayoutManager linearLayoutManager;
    /**
     * The Order list model.
     */
    List<OrderListModel> orderListModel;
    /**
     * The Order list.
     */
    ArrayList orderList = new ArrayList<>();
    /**
     * The Order list adapter.
     */
    com.cse27.foodbee.Recycler.OrderListAdapter orderListAdapter;
    /**
     * The Order list controller.
     */
    OrderListControllerInterface orderListController = new OrderListController(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_order_list);
        homeButton = findViewById(R.id.homeButton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToHome();
            }

        });
        //orderListController.onOrderListShow();
        initRecylerView();
    }

    /**
     * Go to home.
     */
    public void goToHome(){
        Intent intent= new Intent(this, Profile.class );
        startActivity(intent);
    }

    private void initRecylerView() {
        recyclerView = findViewById(R.id.orderListRecyclerView);
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        orderListAdapter = new OrderListAdapter(orderList);
        recyclerView.setAdapter(orderListAdapter);
        orderListAdapter.notifyDataSetChanged();

    }

    @Override
    public void onViewOrderListSuccess(String orderId, Timestamp orderDate, String status, String payementMethod, Double totalCost) {
        Toast.makeText(this," ",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onViewOrderListError() {
        Toast.makeText(this,"You didn't order before !",Toast.LENGTH_LONG).show();
    }
}