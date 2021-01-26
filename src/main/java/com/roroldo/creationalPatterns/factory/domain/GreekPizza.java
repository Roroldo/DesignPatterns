package com.roroldo.creationalPatterns.factory.domain;

public class GreekPizza extends AbstractPizza {

    @Override
    public void prepare() {
        setPizzaName("希腊披萨");
        System.out.println("准备希腊辣酱...");
    }
}
