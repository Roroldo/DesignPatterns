package com.roroldo.principles.singleResponsibility.improve3;

/**
 * 方法内部进行职责划分
 *     好处：不用修改客户端代码
 *     坏处：维护难，大量的 if-else
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
        if ("汽车".equals(vehicle)) {
            System.out.println(vehicle + "在路上运行~");
        }
        if ("飞机".equals(vehicle)) {
            System.out.println(vehicle + "在天空中飞行~");
        }
        if ("轮船".equals(vehicle)) {
            System.out.println(vehicle + "在水中游行~");
        }
    }
}
