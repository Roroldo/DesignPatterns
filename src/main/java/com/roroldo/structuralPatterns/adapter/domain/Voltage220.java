package com.roroldo.structuralPatterns.adapter.domain;

public class Voltage220 {

    //输出 220V 的电压，不变
    public int output220V() {
        int src = 220;
        System.out.println("输入电压 " + src + "V");
        return src;
    }

}
