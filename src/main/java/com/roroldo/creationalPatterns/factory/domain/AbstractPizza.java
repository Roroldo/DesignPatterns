package com.roroldo.creationalPatterns.factory.domain;

import lombok.Setter;

/**
 * 披萨抽象类
 * @author 落霞不孤
 */
@Setter
public abstract class AbstractPizza {
    protected String pizzaName;

    public abstract void prepare();

    public void bake() {
        System.out.println(pizzaName + " baked!");
    }

    public void cut() {
        System.out.println(pizzaName + " cut!");
    }

    public void box() {
        System.out.println(pizzaName + " boxed!");
    }
}
