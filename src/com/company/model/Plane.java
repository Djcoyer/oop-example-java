package com.company.model;

public class Plane extends Vehicle {
    //Boeing... Others? IDK any others lol
    private String model;
    private int yearMade;
    private String airline;

    @Override
    public void move(int feetToMove) {
        System.out.println(String.format("My plane moved %s feet!", feetToMove));
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearMade() {
        return yearMade;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }
}
