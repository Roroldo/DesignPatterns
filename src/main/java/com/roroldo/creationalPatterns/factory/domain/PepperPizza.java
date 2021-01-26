package com.roroldo.creationalPatterns.factory.domain;

public class PepperPizza extends AbstractPizza {
    @Override
    public void prepare() {
        setPizzaName("胡椒披萨");
        System.out.println("准备胡椒...");
    }
}
