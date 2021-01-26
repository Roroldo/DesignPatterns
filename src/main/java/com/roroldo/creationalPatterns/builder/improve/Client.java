package com.roroldo.creationalPatterns.builder.improve;

public class Client {
    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector();
        houseDirector.setHouseAbstractBuilder(new HighBuildingBuilder());
        House house = houseDirector.construct();
        System.out.println("高楼：" + house);
    }
}
