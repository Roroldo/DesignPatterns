package com.roroldo.creationalPatterns.factory.pojo;

public class BJPepperPizza extends AbstractPizza {
    @Override
    public void prepare() {
        setPizzaName("北京胡椒披萨");
        System.out.println("准备北京胡椒披萨材料");
    }
}
