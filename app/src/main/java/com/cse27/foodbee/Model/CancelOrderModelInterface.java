package com.cse27.foodbee.Model;

public interface CancelOrderModelInterface {
    /**
     * returns choice
     * @return
     */

    String getChoice();

    /**
     * returns feedback
     * @return
     */
    String getFeedback();

    /**
     * checks if cancel should be executed
     * @return
     */

    public Integer isCancelOredrComplete();

}
