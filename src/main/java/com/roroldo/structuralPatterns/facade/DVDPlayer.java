package com.roroldo.structuralPatterns.facade;

/**
 * DVDPlayer
 * @author 落霞不孤
 */
public class DVDPlayer {

    //使用单例模式, 使用饿汉式
    private static DVDPlayer dvdPlayer= new DVDPlayer();

    public static DVDPlayer getInstance() {
        return dvdPlayer;
    }

    public void on() {
        System.out.println("dvd on ");
    }

    public void off() {
        System.out.println("dvd off ");
    }


    public void play(String movie) {
        System.out.println("dvd is playing " + movie);
    }

    public void pause() {
        System.out.println("dvd pause ..");
    }

}
