
  
package com.cse27.foodbee.Model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FeedbackModelTest {
    FeedbackModel feedbackModel;

    /**
     * Calling constructor
     */

    @Before
    public void setUp() throws Exception {
        feedbackModel= new FeedbackModel("Chickencurry is so sweet","5.00");
    }
    /**
     * Gets feedback
     */

    @Test
    public void getFeedback() {
        assertEquals("Chickencurry is so sweet",feedbackModel.getFeedback());
    }

    /**
     * Gets rating
     */

    @Test
    public void getFoodRating() {
        assertEquals("lionel1020",feedbackModel.getFoodRating());
    }

    /**
     * Checks if feedback is valid or not
     */

    @Test
    public void isfeedbackValid() {
        assertEquals(1,feedback.isfeedbackValid());
    }
}
