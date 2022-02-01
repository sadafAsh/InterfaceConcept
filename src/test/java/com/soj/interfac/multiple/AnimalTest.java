package com.soj.interfac.multiple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnimalTest {

    @Test
    void testForEating() {
        Animal animal = new Animal();
        String expected = "Animal is eating";
        String actual = animal.eat("Animal is eating");
        assertEquals(expected, actual);
    }

    @Test
    void testForTravelling() {
        Animal animal = new Animal();
        String expected = "animal is travelling";
        String actual = animal.travel("animal is travelling");
        assertEquals(expected, actual);
    }
    @Test
    void testForTravellingByAnimal() {
        AnimalTravel animal = new Animal();
        String expected = "animal is travelling";
        String actual = animal.travel("animal is travelling");
        assertEquals(expected, actual);
}
    @Test
    void testForEatingByAnimal() {
        AnimalEat animal = new Animal();
        String expected = "Animal is eating";
        String actual = animal.eat("Animal is eating");
        assertEquals(expected, actual);
    }


}