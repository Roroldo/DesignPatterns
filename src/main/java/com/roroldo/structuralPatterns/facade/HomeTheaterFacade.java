package com.roroldo.structuralPatterns.facade;

import lombok.AllArgsConstructor;

/**
 * 家庭影院外观类
 * @author 落霞不孤
 */
@AllArgsConstructor
public class HomeTheaterFacade {
    private TheaterLight theaterLight;
    private DVDPlayer dvdPlayer;
    private Screen screen;

    public void watchMovie(String movie) {
        System.out.println("start to watching movie...");
        theaterLight.on();
        theaterLight.dim();
        screen.down();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("------------------------------");
        System.out.println("movie is ended....");
        dvdPlayer.off();
        screen.up();
        theaterLight.bright();
    }

}
