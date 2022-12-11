package com.kodilla.collections.adv.exercises.homework;

import java.util.Arrays;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable(){
        return Arrays.asList(new Flight("Warsaw","London"),new Flight("Warsaw","Oslo"),new Flight("Kraków","Praha"),new Flight("Milan","Warsaw"));
    }
}
