package com.cse27.foodbee;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


public class SearchPageTest {

    SearchPage searchPage;

    public String[] searchQuery= {"", "Bur", "burg", " naga Burger ", "Naga Burger", "Burger"};

    public int expected[] = {1,0,0,0,0,0};


    @Test
    public void queryIsNotEmpty0() throws Exception {
        int n = 0;
        assertEquals(expected[n],searchPage.isValidQuery(searchQuery[n]));
    }

    @Test
    public void queryIsNotEmpty1() throws Exception {
        int n = 1;
        assertEquals(expected[n],searchPage.isValidQuery(searchQuery[n]));
    }

    @Test
    public void queryIsNotEmpty2() throws Exception {
        int n = 2;
        assertEquals(expected[n],searchPage.isValidQuery(searchQuery[n]));
    }

    @Test
    public void queryIsNotEmpty3() throws Exception {
        int n = 3;
        assertEquals(expected[n],searchPage.isValidQuery(searchQuery[n]));
    }

    @Test
    public void queryIsNotEmpty4() throws Exception {
        int n = 4;
        assertEquals(expected[n],searchPage.isValidQuery(searchQuery[n]));
    }

    @Test
    public void queryIsNotEmpty5() throws Exception {
        int n = 5;
        assertEquals(expected[n],searchPage.isValidQuery(searchQuery[n]));
    }

}