package com.soj.interfac.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {
    @Test
             void testDraw() {
        Shape circle = new Circle();
        String expected = "circle is drawn";
        String actual = circle.draw();
        Assertions.assertEquals(expected, actual);
    }
    @Test
     void testDrawFail(){
        Shape circle=new Circle();
        String expected=" drawn";
        String actual=circle.draw();
        Assertions.assertNotEquals(expected,actual);
}}