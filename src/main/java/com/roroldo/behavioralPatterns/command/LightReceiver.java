package com.roroldo.behavioralPatterns.command;

/**
 * 电灯对象
 * @author 落霞不孤
 */
public class LightReceiver {
    void on() {
        System.out.println("打开电灯...");
    }

    void close() {
        System.out.println("关闭电灯...");
    }
}
