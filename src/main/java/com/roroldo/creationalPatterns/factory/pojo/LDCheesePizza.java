package com.roroldo.creationalPatterns.factory.pojo;

public class LDCheesePizza extends AbstractPizza {
    @Override
    public void prepare() {
        setPizzaName("伦敦芝士披萨");
        System.out.println("准备伦敦芝士披萨材料");
    }
}
