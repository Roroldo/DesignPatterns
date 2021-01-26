package com.roroldo.creationalPatterns.factory.factoryMethod;

import com.roroldo.creationalPatterns.factory.pojo.AbstractPizza;

import java.util.Scanner;

/**
 * 抽象披萨商店
 * @author 落霞不孤
 */
public abstract class PizzaStore {


    // 披萨商店的工厂方法
    protected abstract AbstractPizza createPizza(String orderPizzaType);

    public AbstractPizza orderPizza() {
        String orderPizzaType;
        orderPizzaType = getPizzaType();
        AbstractPizza abstractPizza = createPizza(orderPizzaType);
        if (abstractPizza != null) {
            abstractPizza.prepare();
            abstractPizza.bake();
            abstractPizza.cut();
            abstractPizza.box();
        }
        return abstractPizza;
    }


    private String getPizzaType() {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入需要订购的披萨类型：");
        return in.nextLine();
    }
}
