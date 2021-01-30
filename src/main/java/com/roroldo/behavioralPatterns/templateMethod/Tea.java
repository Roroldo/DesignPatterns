package com.roroldo.behavioralPatterns.templateMethod;

public class Tea extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("加入茶叶包...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入些许鲜奶, 请享受吧~");
    }
}
