package com.roroldo.creationalPatterns.builder.improve;

import lombok.Getter;

/**
 * 房子的抽象建造者
 * @author 落霞不孤
 */
public abstract class HouseAbstractBuilder {
    protected House house = new House();

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    public House createHouse() {
        return house;
    }
}
