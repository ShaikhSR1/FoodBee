package com.cse27.foodbee.Controller;

import junit.framework.TestCase;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * The type Order list controller test.
 */
public class OrderListControllerTest extends TestCase {
    /**
     * Text on order list show.
     */
    @Test
    public  void textOnOrderListShow(){
        OrderListController orderListController = Mockito.mock(OrderListController.class);
        orderListController.onOrderListShow();
        Mockito.verify(orderListController, Mockito.times(1)).onOrderListShow();
    }


    /**
     * Test init data.
     */
    @Test
    public void testInitData() {
        OrderListController orderListController = Mockito.mock(OrderListController.class);
        orderListController.initData();
        Mockito.verify(orderListController, Mockito.times(1)).initData();
    }
}