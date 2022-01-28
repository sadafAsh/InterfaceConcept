package com.soj.interfac.statictest;

import com.soj.interfac.staticinterface.Drawable;
import com.soj.interfac.staticinterface.Square;
import com.soj.interfac.staticinterface.Drawable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.DriverManager;

class SquareTest {
    @Test
     void testForDrawing() {
        Drawable dr = new Square();
        String expected = "square is drawn";
        String actual = dr.draw();
        Assertions.assertEquals(expected, actual);
    }

    @Test
     void failforDrawing() {
        Drawable dr = new Square();
        String expected = "no drawn";
        String actual = dr.draw();
        Assertions.assertNotEquals(expected, actual);
    }

    @Test
    void testForStatic() {
        int expected = 27;
        int actual = Drawable.cube(3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testForStaticFailed() {
        int expected = 3;
        int actual = Drawable.cube(3);
        Assertions.assertNotEquals(expected, actual);
    }
}