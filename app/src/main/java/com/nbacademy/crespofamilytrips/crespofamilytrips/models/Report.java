package com.nbacademy.crespofamilytrips.crespofamilytrips.models;

import java.math.BigDecimal;

public class Report {

    private String title;
    private BigDecimal amount;
    private Trip trip;

    public Report(String title, BigDecimal amount, Trip trip) {
        this.title = title;
        this.amount = amount;
        this.trip = trip;
    }


}
