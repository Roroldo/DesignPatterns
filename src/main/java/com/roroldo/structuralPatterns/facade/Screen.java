package com.roroldo.structuralPatterns.facade;

/**
 * 幕布屏幕
 * @author 落霞不孤
 */
public class Screen {
    private static Screen screen = new Screen();

    public static Screen getInstance() {
        return screen;
    }

    public void up() {
        System.out.println("screen up...");
    }

    public void down() {
        System.out.println("screen down...");
    }
}
