package com.cse27.foodbee.Model;

/**
 * The interface Shipping info model interface.
 */
public interface ShippingInfoModelInterface {
    /**
     * Gets full name.
     *
     * @return the full name
     */
    String getFullName();

    /**
     * Gets email.
     *
     * @return the email
     */
    String getEmail();

    /**
     * Gets phone number.
     *
     * @return the phone number
     */
    String getPhoneNumber();

    /**
     * Gets address.
     *
     * @return the address
     */
    String getAddress();

    /**
     * Gets optional note.
     *
     * @return the optional note
     */
    String getOptionalNote();

    /**
     * Is shipping info valid int.
     *
     * @return the int
     */
    int isShippingInfoValid();

}
