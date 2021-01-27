package com.roroldo.structuralPatterns.decorator.domain;

import lombok.Getter;

/**
 * 抽象饮品类: 被装饰者
 * @author 落霞不孤
 */
@Getter
public abstract class Beverage {
    protected String desc;

    /**
     * 饮品价格
     * @return 饮品价格
     */
    public abstract double cost();
}
