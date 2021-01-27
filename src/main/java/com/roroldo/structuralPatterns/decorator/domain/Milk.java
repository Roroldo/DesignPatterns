package com.roroldo.structuralPatterns.decorator.domain;


import lombok.AllArgsConstructor;

/**
 * 牛奶装饰者类
 * @author 落霞不孤
 */

public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
        this.condimentName = "Milk";
        this.condimentPrice = 1.0;
    }

    public void setBeverage(Beverage beverage) {
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
