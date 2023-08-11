package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {

    private int carrying;

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public Lorry(String carClass, Engine engine, Driver driver, String model, int carrying) {
        super(carClass, engine, driver, model);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                '}';
    }
}
