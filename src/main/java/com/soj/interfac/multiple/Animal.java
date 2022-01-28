package com.soj.interfac.multiple;

public class Animal implements Dog, Cat {
    @Override
    public String animalpet() {
        return "animal is the pet animal";
    }

    @Override
    public String generalBehaviour() {
        return "animal is very friendly";
    }
}
