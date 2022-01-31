package com.cse27.foodbee.Model;

/**
 * this is an interface of feedback model
 */
public interface FeedbackModelInterface {
    /**
     * The constant feedback.
     */
    String feedback = "";
    /**
     * The constant foodRating.
     */
    float foodRating = 0;

    /**
     * Gets feedback.
     *
     * @return the feedback
     */
    String getFeedback();

    /**
     * Gets food rating.
     *
     * @return the food rating
     */
    float getFoodRating();
}
