
   
package com.cse27.foodbee.Controller;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

/**
 * The type feedback  controller test.
 */
public class FeedbackControllerTest extends TestCase {


     String feedback = ;
     float foodRating = getfoodRating.toString();
    @Test
  
    public void testonFeedbackSuccess() {
        FeedbackController feedbackController = mock(FeedbackPaymentCodController.class);


        feedbackController.onFeedbackSuccess("Chicken Curry is too sweet", String.valueOf(5.00));

        verify(feedbackController, Mockito.times(1)).onFeedbackSuccess("Chicken Curry is too sweet", String.valueOf(5.00));

    }
}
