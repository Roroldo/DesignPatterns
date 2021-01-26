package com.roroldo.creationalPatterns.factory.factoryMethod;

import com.roroldo.creationalPatterns.factory.pojo.AbstractPizza;
import com.roroldo.creationalPatterns.factory.pojo.BJCheesePizza;
import com.roroldo.creationalPatterns.factory.pojo.BJPepperPizza;

/**
 * 北京披萨店
 * @author 落霞不孤
 */
public class BJPizzaStore extends PizzaStore {

    @Override
    public AbstractPizza createPizza(String orderType) {
        if ("芝士".equals(orderType)) {
            return new BJCheesePizza();
        }
        if ("胡椒".equals(orderType)) {
            return new BJPepperPizza();
        }
        return null;
    }
}
