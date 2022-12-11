package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuit {

    @Test
    public void testFlightFrom(){
        String departure = "Warsaw";
        FlightFinder flightFinder = new FlightFinder();

        List<Flight> flightList = flightFinder.findFlightFrom(departure);

        assertEquals(flightList.size(),2);

    }

    @Test
    public void testFlightTo(){
        String departure = "Oslo";
        FlightFinder flightFinder = new FlightFinder();

        List<Flight> flightList = flightFinder.findFlightTo(departure);

        assertEquals(flightList.size(),1);

    }

}
