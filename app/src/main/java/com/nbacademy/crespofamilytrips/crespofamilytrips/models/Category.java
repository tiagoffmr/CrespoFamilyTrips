package com.nbacademy.crespofamilytrips.crespofamilytrips.models;

import java.math.BigDecimal;
import java.util.List;

public class Category {

    private String categoryID;
    private String name;
    private int value;
    private List<Subcategory> subcategories;
    private List<Expenses> expenses;

    public Category(String categoryID, String name, int value, List<Subcategory> subcategories, List<Expenses> expenses) {
        this.categoryID = categoryID;
        this.name = name;
        this.value = value;
        this.subcategories = subcategories;
        this.expenses = expenses;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Subcategory> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<Subcategory> subcategories) {
        this.subcategories = subcategories;
    }

    public List<Expenses> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expenses> expenses) {
        this.expenses = expenses;
    }

    public int getTotal() {
        int total = 0;
        for ( Subcategory subcategory: subcategories) {
            total += subcategory.getValue();
        }
        return total;
    }

    public BigDecimal getTotalExpenses() {
        BigDecimal totalExpenses = new BigDecimal(0);
        for ( Expenses expense: expenses) {
            totalExpenses.add(expense.getValue());
        }
        return totalExpenses;
    }


}
