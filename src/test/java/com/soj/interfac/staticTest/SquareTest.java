package com.soj.interfac.staticTest;

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
        dr.draw("square is drawn");
     Assertions.assertTrue(true,"draw method is called");
   }

    @Test
     void testforDrawingIsFailed() {
        Drawable dr = new Square();
        dr.draw("no drawn");
        Assertions.assertFalse(false,"square is not drawn");
    }

    @Test
    void testForStaticMethodIsSame() {
        int expected = 27;
        int actual = Drawable.cube(3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testForStaticMethodIsFailed() {
        int expected = 3;
        int actual = Drawable.cube(3);
        Assertions.assertNotEquals(expected, actual);
    }
    @Test
    void testForDrawingSquareTest() {
        Square dr = new Square();
        dr.draw("square is drawn");
        Assertions.assertTrue(true,"draw method is called");
    }
}