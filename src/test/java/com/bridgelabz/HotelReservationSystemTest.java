package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationSystemTest {
    @Test
    public void givenHotelNameShouldReturnTrue() {
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        Assertions.assertTrue(hotelReservationSystem.checkHotelName("LakeWood"));
    }
}
