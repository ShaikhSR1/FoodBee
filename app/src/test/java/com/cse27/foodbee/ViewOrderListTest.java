package com.cse27.foodbee;

import junit.framework.TestCase;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * The type View order list test.
 */
public class ViewOrderListTest extends TestCase {
    /**
     * Test init recyler view.
     */
    @Test
    public void testInitRecylerView() {

        ViewOrderList viewOrderList = Mockito.mock(ViewOrderList.class);
        viewOrderList.initRecylerView();
        Mockito.verify(viewOrderList, Mockito.times(1)).initRecylerView();

    }
}