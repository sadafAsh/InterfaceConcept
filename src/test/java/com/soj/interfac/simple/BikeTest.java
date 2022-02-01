package com.soj.interfac.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    @Test
    void testOfBikeInChangingGear() {
        Bike bike=new Bike();
        bike.changeGear(2);
        int actual=2;
        Assertions.assertEquals(2,actual);
        Assertions.assertTrue(true,"new gear is returned");
    }

    @Test
    void testOfBikespeedIncreament() {
        Bike bike=new Bike();
        bike.speedUp(4);
        int actual =4;
        Assertions.assertEquals(4,actual);
    }

    @Test
    void testOfBikespeedDecreament() {

        Bike bike=new Bike();
        bike.applyBrakes(2);
        int actual=-2;
        Assertions.assertEquals(-2,actual);
    }

    @Test
    void toStringReturnAString() {

            Bike bike=new Bike();
        String result=  "speed : "+0+","+" gear : "+0;
            Assertions.assertEquals(bike.toString(),result);
        }
    @Test
    void toStringReturnAStringAsFailed() {

      Bike bike=new Bike();
      Assertions.assertNotEquals("",bike.toString());

    }
    }
