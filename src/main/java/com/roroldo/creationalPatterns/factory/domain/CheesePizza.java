package com.roroldo.creationalPatterns.factory.domain;

public class CheesePizza extends AbstractPizza {
    @Override
    public void prepare() {
        setPizzaName("芝士披萨");
        System.out.println("准备芝士...");
    }
}
