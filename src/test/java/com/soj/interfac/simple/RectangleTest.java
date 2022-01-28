package com.soj.interfac.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest  {

    @Test
    void testDraw() {
        Shape rectangle=new Rectangle();
        String expected="Rectangle is drawn";
        String actual=rectangle.draw();
        Assertions.assertEquals(expected,actual);

}
@Test
     void testDrawFail(){
        Shape rectangle=new Rectangle();
    String expected="Circle is drawn";
    String actual=rectangle.draw();
    Assertions.assertNotEquals(expected,actual);
}



}