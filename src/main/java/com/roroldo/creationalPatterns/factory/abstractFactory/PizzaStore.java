package com.roroldo.creationalPatterns.factory.abstractFactory;

import com.roroldo.creationalPatterns.factory.pojo.AbstractCoke;
import com.roroldo.creationalPatterns.factory.pojo.AbstractPizza;

/**
 * 披萨店: 充当抽象工厂
 * @author 落霞不孤
 */
public interface PizzaStore {
    // 新增售卖可乐
    AbstractCoke createCoke();

    // 售卖披萨
    AbstractPizza createPizza(String orderPizzaType);
}
