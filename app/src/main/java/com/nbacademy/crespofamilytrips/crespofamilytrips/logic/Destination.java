package com.nbacademy.crespofamilytrips.crespofamilytrips.logic;

import java.util.List;

public class Destination {

    private String destinationID;
    private String name;
    private int duration;
    private List<Category> categories;

    public Destination(String name, int duration) {
        this.name = name;
        this.duration = duration;
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
