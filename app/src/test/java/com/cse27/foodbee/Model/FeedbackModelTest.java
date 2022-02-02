package com.cse27.foodbee.Model;
 
 import junit.framework.TestCase;
 
 import static org.junit.Assert.*;
 
 
 import org.junit.Before;
 import org.junit.Test;
 import org.mockito.Mockito;
 
 
 public class FeedbackModelTest {
 
     FeedbackModel feedbackModel;



     String feedback = ;
     float foodRating = getFoodRating.toString();
 
     public String[][] testCase= {
             { "Chicken Curry is too sweet", String.valueOf(5.00)},
             {"Chicken Curry is too sweet",String.valueOf(5)},
     };
 
     public int expected[]= {1,0};
 
 
 
     public void setUp(int n) throws Exception {
         foodModel = new foodModel(testCase[n][0],float.parsefloat(testCase[n][4]));
     }
 
     @Test
     public void testIsValidfeedback0() throws Exception {
         int n= 0;
         setUp(n);
         assertEquals(expected[n],feedbackModel.isV());
     }
 
     @Test
     public void testIsValidfeedback1() throws Exception {
         int n= 1;
         setUp(n);
assertEquals(expected[n],feedbackModel.isV());
 
 }
