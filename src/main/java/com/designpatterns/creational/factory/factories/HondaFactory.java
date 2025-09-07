package main.java.com.designpatterns.creational.factory.factories;

import main.java.com.designpatterns.creational.factory.companies.Honda;
import main.java.com.designpatterns.creational.factory.interfaces.Vehicle;
import main.java.com.designpatterns.creational.factory.interfaces.VehicleFactory;

public class HondaFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new Honda();
    }
}
