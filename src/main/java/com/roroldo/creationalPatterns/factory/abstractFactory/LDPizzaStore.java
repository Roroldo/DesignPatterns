package com.roroldo.creationalPatterns.factory.abstractFactory;

import com.roroldo.creationalPatterns.factory.pojo.*;

public class LDPizzaStore implements PizzaStore {

    @Override
    public AbstractCoke createCoke() {
        AbstractCoke coke = new CocaCoke();
        System.out.println(coke);
        return coke;
    }

    @Override
    public AbstractPizza createPizza(String orderPizzaType) {
        AbstractPizza abstractPizza = null;
        if ("芝士".equals(orderPizzaType)) {
            abstractPizza = new LDCheesePizza();
            abstractPizza.prepare();
            abstractPizza.bake();
            abstractPizza.cut();
            abstractPizza.box();
        }
        if ("胡椒".equals(orderPizzaType)) {
            abstractPizza = new LDPepperPizza();
            abstractPizza.prepare();
            abstractPizza.bake();
            abstractPizza.cut();
            abstractPizza.box();
        }
        return abstractPizza;
    }
}
