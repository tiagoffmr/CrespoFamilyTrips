package com.nbacademy.crespofamilytrips.crespofamilytrips.logic;

import java.math.BigDecimal;

public class Expenses {

    private int categoryId;
    private String description;
    private BigDecimal value;

    public Expenses(String description, BigDecimal value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal amount) {
        this.value = amount;
    }
}
