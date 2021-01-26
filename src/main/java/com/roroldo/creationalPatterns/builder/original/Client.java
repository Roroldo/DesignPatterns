package com.roroldo.creationalPatterns.builder.original;

/**
 *
 */
public class Client {
    public static void main(String[] args) {
        AbstractHouse abstractHouse = new HighBuilding();
        abstractHouse.build();
    }
}
