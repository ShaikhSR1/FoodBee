package com.cse27.foodbee.Controller;

import android.text.format.Time;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.cse27.foodbee.Model.CartPageModel;
import com.cse27.foodbee.Model.CartPageModelInterface;
import com.cse27.foodbee.Model.OrderListModel;
import com.cse27.foodbee.Model.OrderListModelInterface;
import com.cse27.foodbee.Recycler.CartPageAdapter;
import com.cse27.foodbee.Recycler.OrderListAdapter;
import com.cse27.foodbee.View.CartPageViewInterface;
import com.cse27.foodbee.View.OrderListViewInterface;
import com.google.firebase.Timestamp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/**
 * The type Order list controller.
 */
public class OrderListController implements OrderListControllerInterface{

    /**
     * The Order list view.
     */
    OrderListViewInterface orderListView;
    /**
     * The Linear layout manager.
     */
    LinearLayoutManager linearLayoutManager;
    /**
     * The Order list.
     */
    List<OrderListModel> orderList;
    /**
     * The Order list adapter.
     */
    OrderListAdapter orderListAdapter;
    /**
     * The Root node.
     */
    FirebaseDatabase rootNode;
    /**
     * The Reference.
     */
    DatabaseReference reference;
    /**
     * The Order list auth.
     */
    FirebaseAuth orderListAuth;
    /**
     * The Order id.
     */
    String orderId, /**
     * The Payment method.
     */
    paymentMethod, /**
     * The Status.
     */
    status;
    /**
     * The Total cost.
     */
    double totalCost;
    /**
     * The Order date.
     */
    Timestamp orderDate;
    /**
     * The User id.
     */
    String userId, /**
     * The Nested collection.
     */
    nestedCollection;
    /**
     * The Order number.
     */
    String orderNumber;
    /**
     * The Food bee.
     */
    FirebaseFirestore foodBee = FirebaseFirestore.getInstance();

    /**
     * Instantiates a new Order list controller.
     *
     * @param orderListView the order list view
     */
    public OrderListController(OrderListViewInterface orderListView) {
        this.orderListView = orderListView;
    }

    /**
     * The Order list model.
     */
    OrderListModelInterface orderListModel;

    /**
     * Init data.
     */
    void initData() {
        orderList = new ArrayList<>();
        orderList.add(new OrderListModel(orderId, status, paymentMethod, orderDate, totalCost));
    }

    @Override
    public void onOrderListShow() {
        rootNode = FirebaseDatabase.getInstance();
        orderListAuth = FirebaseAuth.getInstance();
        userId = orderListAuth.getCurrentUser().getUid();
        reference = rootNode.getReference("orderList");
        //userId = "12vEmE2aiHW62TwotQfOQv0TgOf2";
        nestedCollection = "listOfOrder";
        orderNumber = "1";
        DocumentReference documentReference = foodBee.collection("orderInfo").document(userId).collection(nestedCollection).document();
        documentReference.addSnapshotListener((Executor) this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException error) {
                orderId = documentSnapshot.getString("orderId");
                orderDate = documentSnapshot.getTimestamp("orderTime");
                paymentMethod = documentSnapshot.getString("paymentMethod");
                status = documentSnapshot.getString("status");
                totalCost = documentSnapshot.getDouble("totalCost");

                initData();

                if(orderId != " ")
                {
                    orderListView.onViewOrderListSuccess(orderId,orderDate,status,paymentMethod,totalCost);
                }
                else{
                    orderListView.onViewOrderListError();

                }

            }
        });



    }
}
