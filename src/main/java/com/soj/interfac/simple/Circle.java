package com.soj.interfac.simple;

public class Circle implements Shape {

    public Circle() {
        System.out.println("Shape is Circle.....");
    }

    @Override
    public String draw() {
        return "circle is drawn";
    }
}
