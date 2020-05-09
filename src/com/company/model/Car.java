package com.company.model;

public class Car extends Vehicle {
    private String vinNumber;
    private String model;
    private int yearMade;
    private String color;

    public Car() {
    }

    public Car(String vinNumber, String model, int yearMade, String color) {
        this.vinNumber = vinNumber;
        this.model = model;
        this.yearMade = yearMade;
        this.color = color;
    }

    @Override
    public void move(int feetToMove) {
        System.out.println(String.format("My car moved %s feet!", feetToMove));
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }
}
