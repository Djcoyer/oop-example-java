package com.company.model.lot;

import com.company.model.Car;
import com.company.model.lot.CarLot;

import java.util.ArrayList;
import java.util.List;

public class ListCarLot implements CarLot {
    //list represents all cars on the lot
    private List<Car> availableCars;

    public ListCarLot() {
        Car devynsCar = new Car("vin1", "Toyota", 2017, "Silver");
        Car robertsCar = new Car("vin2", "Honda", 2008, "Grey");
        Car bensCar = new Car("vin3", "Toyota", 2014, "White");
        Car braydonsCar = new Car("vin4", "Hyundai", 2015, "Blue");

        //Initializing the list to the cars above
        this.availableCars = new ArrayList<>();
        availableCars.add(devynsCar);
        availableCars.add(robertsCar);
        availableCars.add(bensCar);
        availableCars.add(braydonsCar);

    }

    @Override
    public Car findCarByVinNumber(String vinNumber) {
        //Look through each car on the lot
        for(int i = 0; i < availableCars.size(); i++) {
            Car currentCar = availableCars.get(i);
            //If currentCars[i] has a vinNumber that equals the vin number provided by the user, return that car
            if(currentCar.getVinNumber().equals(vinNumber))
                return currentCar;
        }
        return null;
    }

    @Override
    public void addCar(Car car) {
        this.availableCars.add(car);
    }

    @Override
    public void removeCar(Car car) {
        int indexOfCar = this.availableCars.indexOf(car);
        this.availableCars.remove(indexOfCar);
    }
}
