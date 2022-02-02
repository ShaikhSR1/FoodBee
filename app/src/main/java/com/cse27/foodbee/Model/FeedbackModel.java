package com.cse27.foodbee.Model;

/**
 * this a class of feedback model.
 * here feedback and foodrating is our variable,
 * getFeedback and getFoodRating is our getter function,
 */
public class FeedbackModel implements FeedbackModelInterface{

    private String feedback;
    private float foodRating;

    /**
     * Instantiates a new Feedback model.
     */
    public FeedbackModel() {
    }

    /**
     * Instantiates a new Feedback model.
     *
     * @param feedback   the feedback
     * @param foodRating the food rating
     */
    public FeedbackModel(String feedback, float foodRating) {
        this.feedback = feedback;
        this.foodRating = foodRating;
    }


    @Override
    public String getFeedback() {
        return feedback;
    }

    @Override
    public float getFoodRating() {
        return foodRating;
    }
}



