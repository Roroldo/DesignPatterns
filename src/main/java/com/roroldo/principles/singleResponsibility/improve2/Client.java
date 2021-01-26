package com.roroldo.principles.singleResponsibility.improve2;

/**
 * 对方法进行职责划分
 * @author 落霞不孤
 */
public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.runAtLand("汽车");
        vehicle.runAtAir("飞机");
        vehicle.runAtWater("轮船");
    }
}

class Vehicle {
    public void runAtLand(String vehicle) {
        System.out.println(vehicle + "在路上运行~");
    }

    public void runAtAir(String vehicle) {
        System.out.println(vehicle + "在天空中飞行~");
    }

    public void runAtWater(String vehicle) {
        System.out.println(vehicle + "在水中游行~");
    }
}