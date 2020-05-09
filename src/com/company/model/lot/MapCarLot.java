package com.company.model.lot;

import com.company.model.Car;

import java.util.HashMap;

public class MapCarLot implements CarLot {
    private HashMap<String, Car> availableCars;

    public MapCarLot() {
        Car devynsCar = new Car("vin1", "Toyota", 2017, "Silver");
        Car robertsCar = new Car("vin2", "Honda", 2008, "Grey");
        Car bensCar = new Car("vin3", "Toyota", 2014, "White");
        Car braydonsCar = new Car("vin4", "Hyundai", 2015, "Blue");
        this.availableCars = new HashMap<>();

        //HashMap is a key/value collection -- I use the vin as the key and the car as the value
        //That way I can look up the car by the vin number efficiently using availableCars.get(vin)
        this.availableCars.put(devynsCar.getVinNumber(), devynsCar);
        this.availableCars.put(robertsCar.getVinNumber(), robertsCar);
        this.availableCars.put(bensCar.getVinNumber(), bensCar);
        this.availableCars.put(braydonsCar.getVinNumber(), braydonsCar);
    }

    @Override
    public Car findCarByVinNumber(String vinNumber) {
        //Search the map by the key -- in this case, the vin  number
        return availableCars.get(vinNumber);
    }

    @Override
    public void addCar(Car car) {
        //Add a record to the map where the key is the car's vin number, and the value is the car
        this.availableCars.put(car.getVinNumber(), car);
    }

    @Override
    public void removeCar(Car car) {
        //Remove the record from the map whose key is the car's vin  number
        this.availableCars.remove(car.getVinNumber());
    }
}
