package com.company;

import com.company.model.*;
import com.company.model.lot.ListCarLot;
import com.company.model.lot.MapCarLot;
import com.company.model.shop.Carmax;

public class Main {

    public static void main(String[] args) {
        //Car is a vehicle and inherits the move() function from vehicle
        //Through a transitive property, car can also be interpreted as a vehicle since it shares ALL the same properties as its parent class
        //The same cannot be said the other way around -- A car has all the properties of a vehicle, but a vehicle does NOT have all the properties of a car
        Car car = new Car();

        //Because car is a vehicle, it can be supplied as an input parameter to a method that requires a vehicle
        //After this runs, you should see 'My car moved 100 feet!' as the output, because the car's move() method ran
        VehicleOperations.MoveVehicle(car, 100);


        //A plane is also a vehicle and therefore it also inherits the move() method from the vehicle class
        //However, since it has its own implementation of that method, we'll see a different console output when it runs
        Plane plane = new Plane();

        //After this runs, you should see 'My plane moved 100 feet!' as the output, because this time the plane's implementation of the move() method ran
        VehicleOperations.MoveVehicle(plane, 100);

        /*
        This is a feature of something called *polymorphism*, the part of Object-Oriented programming that allows a class to take many forms
        In this case, the vehicle class takes the form of a car and a plane. Each of the inheriting classes override methods from the parent (vehicle) to create their own implementation.
        Despite the overriding of the move() method, the signature and return type are still honored.
        Therefore, the car and plane classes can be seen as *types* of the vehicle class -- that is, they both inherit that class and have *all* the declared properties thereof.
        To visualize, here is a venn diagram that illustrates this concept:
        https://stackoverflow.com/questions/26953252/class-representation-in-venn-diagram
         */

        carShopExample();
    }

    private static void carShopExample() {
        //Instantiate a car lot for the car shop
        //You can use either of these in the constructor for Carmax and it will still work since they both inherit from CarLot
        ListCarLot listCarLot = new ListCarLot();
        MapCarLot mapCarLot = new MapCarLot();

        //Give carmax (a car shop) any class that implements car lot in order for it to function
        Carmax carmax = new Carmax(mapCarLot);
        int myMoney = 5000;

        //Buy a car from carmax by supplying the vin number and money
        Car myNewCar = carmax.buy("vin2", myMoney);
        myNewCar.move(100);

        try {
            //Will fail because I've still got the car with this vin
            Car myOtherCar = carmax.buy("vin2", myMoney);
        } catch(RuntimeException e) {
            System.out.println(e.getMessage());
        }

        //Sell my car for 10000
        myMoney += carmax.sell(myNewCar);

        //Now buy the first car with the extra money I made
        Car myNewestCar = carmax.buy("vin1", myMoney);

    }
}
