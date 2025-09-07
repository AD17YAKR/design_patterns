package main.java.com.designpatterns.creational.factory;

import main.java.com.designpatterns.creational.factory.factories.BMWFactory;
import main.java.com.designpatterns.creational.factory.factories.HondaFactory;
import main.java.com.designpatterns.creational.factory.factories.ToyotaFactory;
import main.java.com.designpatterns.creational.factory.interfaces.Vehicle;
import main.java.com.designpatterns.creational.factory.interfaces.VehicleFactory;

public class FactoryMain {
    public static void main(String[] args) {
        VehicleFactory hondaFactory = new HondaFactory();
        VehicleFactory toyotaFactory = new ToyotaFactory();
        VehicleFactory bmwFactory = new BMWFactory();
        Vehicle toyota = toyotaFactory.createVehicle();
        toyota.start();
        toyota.stop();
    }
}
