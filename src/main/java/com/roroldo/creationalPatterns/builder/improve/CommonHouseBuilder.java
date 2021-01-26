package com.roroldo.creationalPatterns.builder.improve;

/**
 * 普通房子的建造者
 * @author 落霞不孤
 */
public class CommonHouseBuilder extends HouseAbstractBuilder {

    @Override
    public void buildBasic() {
        house.setBasic("打普通房子的地基");
    }

    @Override
    public void buildWalls() {
        house.setWall("砌普通房子的墙");
    }

    @Override
    public void roofed() {
        house.setRoofed("封普通房子的屋顶");
    }
}
