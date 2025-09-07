package main.java.com.designpatterns.creational.factory.factories;


import main.java.com.designpatterns.creational.factory.companies.Toyota;
import main.java.com.designpatterns.creational.factory.interfaces.Vehicle;
import main.java.com.designpatterns.creational.factory.interfaces.VehicleFactory;

public class ToyotaFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Toyota();
    }
}
