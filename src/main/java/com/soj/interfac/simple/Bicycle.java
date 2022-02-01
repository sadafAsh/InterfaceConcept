package com.soj.interfac.simple;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bicycle implements Vehicle {
    static final Logger logger = LogManager.getLogger(Bicycle.class.getName());
    private int speed;
    private int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    @Override
    public String toString() {
        logger.debug("The bicycle present state :");
        return "speed : " + speed + "," +
                " gear : " + gear;
    }
}
