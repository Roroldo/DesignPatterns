package com.roroldo.creationalPatterns.builder.original;

/**
 * 普通房子
 * @author 落霞不孤
 */
public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("打普通房子的地基");

    }

    @Override
    public void buildWalls() {
        System.out.println("砌普通房子的墙");

    }

    @Override
    public void roofed() {
        System.out.println("封普通房子的屋顶");
    }
}
