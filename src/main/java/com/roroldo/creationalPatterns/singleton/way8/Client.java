package com.roroldo.creationalPatterns.singleton.way8;

/**
 * 懒汉式（线程安全_枚举）
 *     * effective java 作者推荐的方式
 * @author 落霞不孤
 */
public class Client {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        singleton1.method();
    }
}

enum Singleton {
    INSTANCE;
    public void method() {
        System.out.println("Hello, Design Patterns!");
    }
}

// 在 JDK 中，java.lang.Runtime 是经典的单例模式(饿汉式)