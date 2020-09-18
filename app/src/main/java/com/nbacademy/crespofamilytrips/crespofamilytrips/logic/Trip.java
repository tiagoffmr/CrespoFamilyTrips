package com.nbacademy.crespofamilytrips.crespofamilytrips.logic;

import java.util.List;

public class Trip {

    private String tripID;
    private String name;
    private String startDate;
    private String endDate;
    private int nPassengers;
    private List<Destination> destinations;

    public Trip(String name, String startDate, String endDate, int nPassengers) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.nPassengers = nPassengers;
    }




}
