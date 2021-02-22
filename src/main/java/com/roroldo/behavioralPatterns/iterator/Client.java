package com.roroldo.behavioralPatterns.iterator;

/**
 * 服务端
 * @author 落霞不孤
 */
public class Client {
    public static void main(String[] args) {
        Waitress waitress = new Waitress();
        waitress.showAllMenuItems();
    }
}
