package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {

    private String carClass;
    private Engine engine;
    private Driver driver;
    private String model;

    public Car(String carClass, Engine engine, Driver driver, String model) {
        this.carClass = carClass;
        this.engine = engine;
        this.driver = driver;
        this.model = model;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void start() {
        System.out.println("Let's go");
    }

    public void stop() {
        System.out.println("Let's stop");
    }

    public void turnRight() {
        System.out.println("Let's turn right");
    }

    public void turnLeft() {
        System.out.println("Let's turn left");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carClass='" + carClass + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", model='" + model + '\'' +
                '}';
    }
}
