package com.soj.interfac.simple;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bike implements Vehicle {
    static final Logger logger = LogManager.getLogger(Bike.class.getName());
    private int gear;
    private int speed;

    @Override
    public void changeGear(int newGear) {
        this.gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;

    }

    @Override
    public void applyBrakes(int decreament) {
        speed -= decreament;

    }

    @Override
    public String toString() {
        logger.debug("The bike present state :");
        return "speed : " + speed + "," +
                " gear : " + gear;
    }
}
