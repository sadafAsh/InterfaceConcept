package com.soj.interfac;

import com.soj.interfac.multiple.Animal;
import com.soj.interfac.simple.Bicycle;
import com.soj.interfac.simple.Bike;
import com.soj.interfac.staticinterface.Drawable;
import com.soj.interfac.staticinterface.Square;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Main {
    static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {

        logger.info("simple interface");
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);
        String display = bike.toString();
        logger.debug(display);

        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.applyBrakes(1);
        bicycle.speedUp(3);
        String display1 = bicycle.toString();
        logger.debug(display1);


        logger.info("........................");
        logger.info("multiple interface");
        Animal animal = new Animal();
        String eating = animal.eat("Animal is eating");
        logger.info(eating);
        String travelling = animal.travel("Animal is travelling");
        logger.info(travelling);

        logger.info(".......................");

        Square sq = new Square();
         sq.draw("square is drawn");
        logger.debug(Drawable.cube(3));

    }
}
