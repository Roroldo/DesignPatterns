package com.roroldo.behavioralPatterns.templateMethod;

public class Coffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("加入咖啡粉...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入牛奶和糖, 大功告成！请享受吧~");
    }
}
