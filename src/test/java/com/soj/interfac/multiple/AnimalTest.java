package com.soj.interfac.multiple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTest {

    @Test
    void animalpetAsCatTest() {
        Cat cat=new Animal();
        String expected="animal is the pet animal";
        String actual=cat.animalpet();
        assertEquals(expected,actual);
    }
    @Test
    void generalBehaviourTest() {
        Dog dog=new Animal();
        String expected="animal is very friendly";
        String actual=dog.generalBehaviour();
        assertEquals(expected,actual);
    }

}