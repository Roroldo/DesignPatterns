package com.roroldo.creationalPatterns.builder.original;

/**
 * 高楼
 * @author 落霞不孤
 */
public class HighBuilding extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("打高楼的地基");

    }

    @Override
    public void buildWalls() {
        System.out.println("砌高楼的墙");

    }

    @Override
    public void roofed() {
        System.out.println("封高楼的屋顶");
    }
}
