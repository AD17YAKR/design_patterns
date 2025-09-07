package main.java.com.designpatterns.creational.factory.companies;


import main.java.com.designpatterns.creational.factory.interfaces.Vehicle;

public class BMW implements Vehicle {
    public void start() {
        System.out.println("BMW started");
    }

    public void stop() {
        System.out.println("BMW stopped");
    }
}
