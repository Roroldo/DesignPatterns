package com.roroldo.creationalPatterns.factory.pojo;

public class LDPepperPizza extends AbstractPizza {
    @Override
    public void prepare() {
        setPizzaName("伦敦胡椒披萨");
        System.out.println("准备伦敦胡椒披萨材料");
    }
}
