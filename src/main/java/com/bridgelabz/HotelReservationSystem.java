package com.bridgelabz;

import java.util.LinkedList;
import java.util.List;

public class HotelReservationSystem {
    List<Hotel> hotelsList = new LinkedList<>();

    /**
     * adding hotels to list and checking whether it is present or not
     * @param str
     * @return true or false
     */
    public boolean addingHotelsToList(String str){
        //creating new hotels
        Hotel hotel1 = new Hotel("LakeWood",3);
        Hotel hotel2 = new Hotel("BridgeWood",4);
        Hotel hotel3 = new Hotel("RidgeWood",5);
        //Adding hotels in to the list
        try {
            hotelsList.add(hotel1);
            hotelsList.add(hotel2);
            hotelsList.add(hotel3);
        }
        catch(Exception e){
            System.out.println(e);
        }
        //checking whether the hotel is present or not
        return hotelsList.stream().filter(hotel -> hotel.hotelName == str ).findFirst().isPresent();
    }

}
