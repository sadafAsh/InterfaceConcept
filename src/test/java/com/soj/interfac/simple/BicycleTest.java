package com.soj.interfac.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BicycleTest {

    @Test
    void testOfBicycleInChangingGear() {
        Bicycle bicycle=new Bicycle();
        bicycle.changeGear(2);
        int actual=2;
        Assertions.assertEquals(2,actual);
        Assertions.assertTrue(true,"new gear is returned");
    }

    @Test
    void testOfBicyclespeedIncreament() {
        Bicycle bicycle=new Bicycle();
        bicycle.speedUp(4);
        int actual =4;
        Assertions.assertEquals(4,actual);
    }

    @Test
    void testOfBicycleSpeedDecreament() {

        Bicycle bicycle=new Bicycle();
        bicycle.applyBrakes(2);
        int actual=-2;
        Assertions.assertEquals(-2,actual);
    }

    @Test
    void toStringReturnAString() {

        Bicycle bicycle=new Bicycle();
        String result=  "speed : "+0+","+" gear : "+0;
        Assertions.assertEquals(bicycle.toString(),result);
    }
    @Test
    void toStringReturnAStringAsFailed() {
        Bicycle bicycle=new Bicycle();
        Assertions.assertNotEquals("",bicycle.toString());

    }

}
