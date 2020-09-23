package com.nbacademy.crespofamilytrips.crespofamilytrips;

import java.util.List;

public class Destination {

    private String destinationID;
    private String name;
    private int duration;
    private List<Category> categories;

    public Destination(String destinationID, String name, int duration, List<Category> categories) {
        this.destinationID = destinationID;
        this.name = name;
        this.duration = duration;
        this.categories = categories;
    }

    public String getDestinationID() {
        return destinationID;
    }

    public void setDestinationID(String destinationID) {
        this.destinationID = destinationID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public int getTotal() {
        int total = 0;
        for ( Category obj: categories) {
            total += obj.getValue();
        }
        return total;
    }

}
