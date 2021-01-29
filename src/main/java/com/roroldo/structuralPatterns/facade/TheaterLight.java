package com.roroldo.structuralPatterns.facade;

/**
 * 影院灯光
 * @author 落霞不孤
 */
public class TheaterLight {
    private static TheaterLight theaterLight = new TheaterLight();

    public static TheaterLight getInstance() {
        return theaterLight;
    }

    public void on() {
        System.out.println("theaterLight on...");
    }

    public void off() {
        System.out.println("theaterLight off...");
    }

    public void dim() {
        System.out.println("dim theaterLight...");
    }

    public void bright() {
        System.out.println("bright theaterLight...");
    }
}
