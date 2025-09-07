package main.java.com.designpatterns.creational.factory.companies;

import main.java.com.designpatterns.creational.factory.interfaces.Vehicle;

public class Honda implements Vehicle {
    public void start() {
        System.out.println("Honda started");
    }

    public void stop() {
        System.out.println("Honda stopped");
    }
}
