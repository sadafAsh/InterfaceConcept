package com.soj.interfac.simple;

public class Rectangle implements Shape {

    public Rectangle() {
        System.out.println("Shape is Rectangle.....");
    }

    @Override
    public String draw() {
        return "Rectangle is drawn";
    }
}
