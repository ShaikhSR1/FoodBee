package com.cse27.foodbee.Controller;

import android.widget.RatingBar;

/**
 * The interface Feedback controller interface.
 */
public interface FeedbackControllerInterface {
    /**
     * On rating changed.
     *
     * @param ratingBar the rating bar
     * @param rating    the rating
     * @param fromUser  the from user
     */
    void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser);

    /**
     * On feedback success.
     *
     * @param message the message
     */
    void onFeedbackSuccess(String message);

    /**
     * On feedback error.
     *
     * @param message the message
     */
    void onFeedbackError(String message);

}
