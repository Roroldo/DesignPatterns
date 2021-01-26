package com.roroldo.creationalPatterns.singleton.way1;

/**
 * 饿汉式（静态常量）
 * @author 落霞不孤
 */
public class Client {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1.hashCode() == singleton2.hashCode());
    }
}

class Singleton {
    // 构造方法私有化
    private Singleton() {

    }

    // 本类内部创建实例对象
    private final static Singleton INSTANCE = new Singleton();

    // 提供一个给外部使用的静态方法，返回实例对象
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
