package com.cse27.foodbee.Model;

import android.text.TextUtils;

public class CancelOrderModel implements CancelOrderModelInterface {


    String orderNumber, choice, feedback;

    /**
     * Constructor
     * sets values sent by controller
     * @param choice
     * @param feedback
     */

    public CancelOrderModel(String orderNumber, String choice, String feedback) {
        this.orderNumber= orderNumber;
        this.choice = choice;
        this.feedback = feedback;
    }

    /**
     * returns choice
     *
     * @return
     */
    @Override
    public String getChoice() {
        return choice;
    }

    /**
     * returns feedback
     *
     * @return
     */
    @Override
    public String getFeedback() {
        return feedback;
    }

    /**
     * checks if cancel should be executed
     *
     * @return
     */
    @Override
    public Integer isCancelOredrComplete() {
        if (TextUtils.isEmpty(getChoice())){
            return 0;
        }else if(TextUtils.isEmpty(getFeedback())){
            return 1;
        }else
            return -1;
    }
}
