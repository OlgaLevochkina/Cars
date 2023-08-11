package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    private double speed;

    public SportCar(String carClass, Engine engine, Driver driver, String model, double speed) {
        super(carClass, engine, driver, model);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                '}';
    }
}
