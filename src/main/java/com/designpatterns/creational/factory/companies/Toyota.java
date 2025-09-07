package main.java.com.designpatterns.creational.factory.companies;


import main.java.com.designpatterns.creational.factory.interfaces.Vehicle;

public class Toyota implements Vehicle {
    public void start() {
        System.out.println("Toyata started");
    }

    public void stop() {
        System.out.println("Toyata stopped");
    }
}
