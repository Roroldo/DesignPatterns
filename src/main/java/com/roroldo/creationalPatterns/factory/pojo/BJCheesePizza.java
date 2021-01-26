package com.roroldo.creationalPatterns.factory.pojo;

public class BJCheesePizza extends AbstractPizza {
    @Override
    public void prepare() {
        setPizzaName("北京芝士披萨");
        System.out.println("准备北京芝士披萨材料");
    }
}
