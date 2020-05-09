package com.company.model.lot;

import com.company.model.Car;

public interface CarLot {
    Car findCarByVinNumber(String vinNumber);
    void addCar(Car car);
    void removeCar(Car car);
}
