package com.nbacademy.crespofamilytrips.crespofamilytrips.models;

import java.util.List;

public class Trip {

    private String tripID;
    private String name;
    private String startDate;
    private String endDate;
    private int nPassengers;
    private List<Destination> destinations;

    public Trip(String tripID, String name, String startDate, String endDate, int nPassengers, List<Destination> destinations) {
        this.tripID = tripID;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.nPassengers = nPassengers;
        this.destinations = destinations;
    }

    public String getTripID() {
        return tripID;
    }

    public void setTripID(String tripID) {
        this.tripID = tripID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getnPassengers() {
        return nPassengers;
    }

    public void setnPassengers(int nPassengers) {
        this.nPassengers = nPassengers;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }
}
