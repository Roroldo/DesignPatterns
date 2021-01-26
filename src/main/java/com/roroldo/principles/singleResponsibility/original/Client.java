package com.roroldo.principles.singleResponsibility.original;

/**
 * 客户端
 * @author 落霞不孤
 */
public class Client {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("飞机");
        vehicle.run("轮船");
    }

}

/**
 * 交通工具类
 */
class Vehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + "在路上运行~");
    }
}
