package com.roroldo.structuralPatterns.decorator.domain;


public class Espresso extends Beverage {
    public Espresso() {
        desc = "浓 coffee";
    }

    @Override
    public double cost() {
        return 3.00;
    }
}
