package com.roroldo.creationalPatterns.factory.factoryMethod;

import com.roroldo.creationalPatterns.factory.pojo.*;

/**
 * 伦敦披萨商店
 * @author 落霞不孤
 */
public class LDPizzaStore extends PizzaStore {

    @Override
    public AbstractPizza createPizza(String orderType) {
        if ("芝士".equals(orderType)) {
            return new LDCheesePizza();
        }
        if ("胡椒".equals(orderType)) {
            return new LDPepperPizza();
        }
        return null;
    }
}
