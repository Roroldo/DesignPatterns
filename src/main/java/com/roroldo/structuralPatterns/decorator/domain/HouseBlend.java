package com.roroldo.structuralPatterns.decorator.domain;


/**
 * 具体的饮品类
 * @author 落霞不孤
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        desc = "首选 coffee";
    }

    @Override
    public double cost() {
        return 2.00;
    }
}
