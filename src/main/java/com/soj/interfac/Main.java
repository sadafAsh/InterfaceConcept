package com.soj.interfac;

import com.soj.interfac.multiple.Animal;
import com.soj.interfac.simple.Circle;
import com.soj.interfac.simple.Rectangle;
import com.soj.interfac.simple.Shape;
import com.soj.interfac.staticinterface.Drawable;
import com.soj.interfac.staticinterface.Square;

public class Main {
    public static void main(String[] args){

        Shape shape=new Circle();
        String circle=shape.draw();
        System.out.println(circle);
        Shape shape1=new Rectangle();
        String rectangle=shape1.draw();
        System.out.println(rectangle);


        System.out.println("........................");
        Animal cat=new Animal();
        String animal=cat.animalpet();
        System.out.println(animal);
        String animal1=cat.generalBehaviour();
        System.out.println(animal1);
        System.out.println(".......................");

        Square sq=new Square();
        String square=sq.draw();
        System.out.println(square);
        System.out.println(Drawable.cube(3));

    }
}
