package com.roroldo.structuralPatterns.decorator.domain;



public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.condimentName = "Mocha";
        this.condimentPrice = 0.5;
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", " + this.condimentName;
    }

    @Override
    public double cost() {
        return this.condimentPrice + beverage.cost();
    }
}
