package com.roroldo.creationalPatterns.factory.simpleFactory;

import com.roroldo.creationalPatterns.factory.domain.AbstractPizza;

import java.util.Scanner;

public class PizzaStore {
    private SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public AbstractPizza orderPizza() {
        String orderPizzaType;
        orderPizzaType = getPizzaType();
        AbstractPizza pizza = simplePizzaFactory.createPizza2(orderPizzaType);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }


    private String getPizzaType() {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入需要订购的披萨类型：");
        return in.nextLine();
    }
}
