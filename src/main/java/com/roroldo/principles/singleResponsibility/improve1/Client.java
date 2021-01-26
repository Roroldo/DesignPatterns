package com.roroldo.principles.singleResponsibility.improve1;

/**
 * 对类进行职责划分
 * @author 落霞不孤li
 */
public class Client {

    public static void main(String[] args) {
        LandVehicle landVehicle = new LandVehicle();
        AirVehicle airVehicle = new AirVehicle();
        WaterVehicle waterVehicle = new WaterVehicle();

        landVehicle.run("汽车");
        airVehicle.run("飞机");
        waterVehicle.run("轮船");
    }
}


class LandVehicle{
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行~");
    }
}

class AirVehicle{
    public void run(String vehicle) {
        System.out.println(vehicle + "在天空中飞行~");
    }
}

class WaterVehicle{
    public void run(String vehicle) {
        System.out.println(vehicle + "在水上游行~");
    }
}