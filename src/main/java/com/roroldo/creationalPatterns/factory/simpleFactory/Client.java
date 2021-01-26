package com.roroldo.creationalPatterns.factory.simpleFactory;


import com.roroldo.creationalPatterns.factory.domain.AbstractPizza;

/**
 * 订购披萨客户类
 * @author 落霞不孤
 */
public class Client {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        AbstractPizza pizza = pizzaStore.orderPizza();
    }
}
