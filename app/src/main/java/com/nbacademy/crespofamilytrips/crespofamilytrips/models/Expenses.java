package com.nbacademy.crespofamilytrips.crespofamilytrips.models;

import java.math.BigDecimal;

public class Expenses {

    private int categoryId;
    private String description;
    private BigDecimal value;

    public Expenses(int categoryId, String description, BigDecimal value) {
        this.categoryId = categoryId;
        this.description = description;
        this.value = value;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
