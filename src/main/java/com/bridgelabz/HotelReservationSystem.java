package com.bridgelabz;

import java.util.LinkedList;
import java.util.List;

public class HotelReservationSystem {
    List<Hotel> hotelsList = new LinkedList<>();

    /**
     * adding hotels to list
     * @param str
     * @return
     */
    public boolean addingHotelsToList(String str){
        Hotel hotel1 = new Hotel("LakeWood",3);
        Hotel hotel2 = new Hotel("BridgeWood",4);
        Hotel hotel3 = new Hotel("RidgeWood",5);
        hotelsList.add(hotel1);
        hotelsList.add(hotel2);
        hotelsList.add(hotel3);
        return hotelsList.stream().filter(hotel -> hotel.hotelName == str ).findFirst().isPresent();
    }

}
