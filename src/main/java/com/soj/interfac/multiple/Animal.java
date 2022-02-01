package com.soj.interfac.multiple;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Animal implements AnimalEat, AnimalTravel {

    static final Logger logger = LogManager.getLogger(Animal.class.getName());

    @Override
    public String eat(String eat) {
        return eat;
    }

    @Override
    public String travel(String travel) {
        return travel;
    }
}
