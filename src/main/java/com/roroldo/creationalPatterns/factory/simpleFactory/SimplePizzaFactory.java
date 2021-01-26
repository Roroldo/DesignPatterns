package com.roroldo.creationalPatterns.factory.simpleFactory;

import com.roroldo.creationalPatterns.factory.domain.AbstractPizza;
import com.roroldo.creationalPatterns.factory.domain.CheesePizza;
import com.roroldo.creationalPatterns.factory.domain.GreekPizza;
import com.roroldo.creationalPatterns.factory.domain.PepperPizza;

/**
 * 简单披萨工厂类
 * @author 落霞不孤
 */
public class SimplePizzaFactory {
    // 推荐用静态方法创建对象
    public static AbstractPizza createPizza(String orderPizzaType) {
        AbstractPizza abstractPizza = null;
        if ("greek".equals(orderPizzaType)) {
            abstractPizza = new GreekPizza();
        } else if ("cheese".equals(orderPizzaType)) {
            abstractPizza = new CheesePizza();
        } else if ("pepper".equals(orderPizzaType)) {
            abstractPizza = new PepperPizza();
        }
        return abstractPizza;
    }

    public AbstractPizza createPizza2(String orderPizzaType) {
        AbstractPizza abstractPizza = null;
        if ("greek".equals(orderPizzaType)) {
            abstractPizza = new GreekPizza();
        } else if ("cheese".equals(orderPizzaType)) {
            abstractPizza = new CheesePizza();
        } else if ("pepper".equals(orderPizzaType)) {
            abstractPizza = new PepperPizza();
        }
        return abstractPizza;
    }

}
