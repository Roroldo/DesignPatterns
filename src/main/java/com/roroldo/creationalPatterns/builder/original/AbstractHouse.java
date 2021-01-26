package com.roroldo.creationalPatterns.builder.original;

/**
 * 把建造房子的过程和房子耦合在一起
 */

public abstract class AbstractHouse {

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
        System.out.println("房子建设完毕~");
    }

}
