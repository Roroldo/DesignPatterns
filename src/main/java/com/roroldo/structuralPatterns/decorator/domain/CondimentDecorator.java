package com.roroldo.structuralPatterns.decorator.domain;

/**
 * 配料装饰者抽象类
 *  之所以继承饮品类是为了重写饮品的默认实现方法
 * @author 落霞不孤
 */
public abstract class CondimentDecorator extends Beverage {
    // 配料名和价格
    protected String condimentName;
    protected double condimentPrice;

    @Override
    public abstract String getDesc();
}
