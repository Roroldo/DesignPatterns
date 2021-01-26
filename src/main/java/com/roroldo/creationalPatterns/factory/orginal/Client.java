package com.roroldo.creationalPatterns.factory.orginal;

/**
 * 订购披萨客户
 * @author 落霞不孤
 */
public class Client {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza();
    }
}
