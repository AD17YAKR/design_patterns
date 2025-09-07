package main.java.com.designpatterns.creational.factory.factories;

import main.java.com.designpatterns.creational.factory.companies.BMW;
import main.java.com.designpatterns.creational.factory.interfaces.Vehicle;
import main.java.com.designpatterns.creational.factory.interfaces.VehicleFactory;

public class BMWFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new BMW();
    }
}
