package com.cse27.foodbee.Recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cse27.foodbee.Model.CartPageModel;
import com.cse27.foodbee.Model.OrderListModel;
import com.cse27.foodbee.R;
import com.google.firebase.Timestamp;

import java.util.List;

/**
 * The type Order list adapter.
 */
public class OrderListAdapter extends RecyclerView.Adapter<OrderListAdapter.ViewHolder>{

    private List<OrderListModel> orderListModel;

    /**
     * Instantiates a new Order list adapter.
     *
     * @param orderListModel the order list model
     */
    public OrderListAdapter(List<OrderListModel> orderListModel){
        this.orderListModel = orderListModel;
    }

    @NonNull
    @Override
    public OrderListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_view_order_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderListAdapter.ViewHolder holder, int position) {
        String orderId = orderListModel.get(position).getOrderId();
        Timestamp orderDate = orderListModel.get(position).getOrderDate();
        String status = orderListModel.get(position).getStatus();
        String paymentMethod = orderListModel.get(position).getPaymentMethod();
        double totalCost = orderListModel.get(position).getTotalCost();

        holder.setData(orderId, orderDate, status, paymentMethod, totalCost);
    }

    @Override
    public int getItemCount() {
        return orderListModel.size();
    }

    /**
     * The type View holder.
     */
    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView viewOrderId, viewOrderDate, viewStatus, viewPaymentMethod, viewTotalCost;

        /**
         * Instantiates a new View holder.
         *
         * @param itemView the item view
         */
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            viewOrderId = itemView.findViewById(R.id.orderId);
            viewOrderDate = itemView.findViewById(R.id.orderDate);
            viewStatus = itemView.findViewById(R.id.status);
            viewPaymentMethod = itemView.findViewById(R.id.paymentMethod);
            viewTotalCost = itemView.findViewById(R.id.totalCost);
        }

        /**
         * Sets data.
         *
         * @param orderId       the order id
         * @param orderDate     the order date
         * @param status        the status
         * @param paymentMethod the payment method
         * @param totalCost     the total cost
         */
        public void setData( String orderId, Timestamp orderDate, String status, String paymentMethod, double totalCost) {
            viewOrderId.setText(orderId);
            //viewOrderDate.setText(orderDate);
            viewStatus.setText(status);
            viewPaymentMethod.setText(paymentMethod);
            viewTotalCost.setText((int) totalCost);
        }

    }
}
