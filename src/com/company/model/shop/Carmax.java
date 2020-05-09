package com.company.model.shop;

import com.company.model.Car;
import com.company.model.lot.CarLot;

public class Carmax extends CarShop {
    private CarLot carLot;

    public Carmax(CarLot carLot) {
        this.carLot = carLot;
        this.setPriceForAfter2010(10000);
        this.setPriceForBefore2010(5000);
    }

    //Arbitrary method to show that the carmax class can have a different way of doing 'business logic' than another implementation of the CarShop
    private int calculatePrice(int yearMade) {
        if(yearMade > 2010)
            return this.getPriceForAfter2010();
        else return this.getPriceForBefore2010();
    }

    //Simulates selling a car TO THE SHOP
    @Override
    public int sell(Car car) {
        int yearMade = car.getYearMade();
        this.carLot.addCar(car);
        return calculatePrice(yearMade);
    }

    @Override
    public Car buy(String vinNumber, int cash) {
        Car carToBuy = this.carLot.findCarByVinNumber(vinNumber);
        if(carToBuy == null)
            throw new RuntimeException("Car is not available!");
        int yearMade = carToBuy.getYearMade();
        //If the cash supplied is as much as the car costs,
        // The buyer receives the car, simulated by removing it from the lot
        if(cash >= calculatePrice(yearMade)) {
            this.carLot.removeCar(carToBuy);
            return carToBuy;
        }
        return null;
    }
}
