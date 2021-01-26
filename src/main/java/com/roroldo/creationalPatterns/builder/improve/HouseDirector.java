package com.roroldo.creationalPatterns.builder.improve;

import lombok.Getter;
import lombok.Setter;

/**
 * 房子指挥者，负责和客户端打交道，房子的建造
 * @author 落霞不孤
 */
@Setter
@Getter
public class HouseDirector {
    private HouseAbstractBuilder houseAbstractBuilder;

    public House construct() {
        houseAbstractBuilder.buildBasic();
        houseAbstractBuilder.buildWalls();
        houseAbstractBuilder.roofed();
        return houseAbstractBuilder.createHouse();
    }
}
