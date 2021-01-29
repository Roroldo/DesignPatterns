package com.roroldo.structuralPatterns.facade;

public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade theaterFacade = new HomeTheaterFacade(TheaterLight.getInstance(), DVDPlayer.getInstance(), Screen.getInstance());
        theaterFacade.watchMovie("无间道");
        theaterFacade.endMovie();
    }
}
