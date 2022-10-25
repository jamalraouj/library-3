package com.Entity;

public class Book {
    private int id;
    private String name;
    private String description;
    private boolean reserved;

    public Book(int id, String name, String description, boolean reserved) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.reserved = reserved;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
}
