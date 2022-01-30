package com.cse27.foodbee;

import junit.framework.TestCase;

import org.mockito.Mockito;

/**
 * The type Search result test.
 */
public class SearchResultTest extends TestCase {

    /**
     * Test on create.
     */
    public void testOnCreate() {

        SearchResult searchResult = Mockito.mock(SearchResult.class);
        searchResult.firebaseFoodSearch("burger");
        Mockito.verify(searchResult, Mockito.times(1)).firebaseFoodSearch("burger");

    }
}