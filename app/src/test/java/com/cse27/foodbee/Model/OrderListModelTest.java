package com.cse27.foodbee.Model;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

/**
 * The type Order list model test.
 */
public class OrderListModelTest extends TestCase {

    /**
     * The Order list model.
     */
    OrderListModel orderListModel;

    @Before
    public void setUp() throws Exception {
        //orderListModel = new OrderListModel("202201", "Delivered", "COD", "2022‑01‑10 17:45:30.005", 1099.00);
    }

    /**
     * Test get order id.
     */
    @Test
    public void testGetOrderId() {
        assertEquals("202201",orderListModel.getOrderId());
    }

    /**
     * Test get order date.
     */
    @Test
    public void testGetOrderDate() {
        assertEquals("2022‑01‑10 17:45:30.005",orderListModel.getOrderDate());
    }

    /**
     * Test get status.
     */
    @Test
    public void testGetStatus() {
        assertEquals("Delivered",orderListModel.getStatus());
    }

    /**
     * Test get payment method.
     */
    @Test
    public void testGetPaymentMethod() {
        assertEquals("COD",orderListModel.getPaymentMethod());
    }

    /**
     * Test get total cost.
     */
    @Test
    public void testGetTotalCost() {
        assertEquals("1099.00",orderListModel.getTotalCost());
    }
}