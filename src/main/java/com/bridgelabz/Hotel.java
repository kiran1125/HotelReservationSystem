package com.bridgelabz;

/**
 * this class is for hotel objects
 */
public class Hotel {
    //class level variables
    String hotelName;
    int hotelRating;

    /**
     * this constructor is to create objects
     * @param hotelName
     * @param hotelRating
     */
    Hotel(String hotelName, int hotelRating) {
        //Assigning values to class level variables
        this.hotelName = hotelName;
        this.hotelRating = hotelRating;
    }

}
