package com.roroldo.creationalPatterns.builder.improve;

/**
 * 高楼的建造者
 * @author 落霞不孤
 */
public class HighBuildingBuilder extends HouseAbstractBuilder {

    @Override
    public void buildBasic() {
        house.setBasic("打高楼的地基");
    }

    @Override
    public void buildWalls() {
        house.setWall("砌高楼的墙");
    }

    @Override
    public void roofed() {
        house.setRoofed("封高楼的屋顶");
    }
}
