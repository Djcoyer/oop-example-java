package com.company.model.shop;

import com.company.model.Car;

public abstract class CarShop {
    private int priceForBefore2010;
    private int priceForAfter2010;

    //Returns money for your car
    abstract int sell(Car car);

    //Takes the id of the car to buy and the cash to buy it with
    abstract Car buy(String vinNumber, int cash);

    public int getPriceForBefore2010() {
        return priceForBefore2010;
    }

    public void setPriceForBefore2010(int priceForBefore2010) {
        this.priceForBefore2010 = priceForBefore2010;
    }

    public int getPriceForAfter2010() {
        return priceForAfter2010;
    }

    public void setPriceForAfter2010(int priceForAfter2010) {
        this.priceForAfter2010 = priceForAfter2010;
    }
}
