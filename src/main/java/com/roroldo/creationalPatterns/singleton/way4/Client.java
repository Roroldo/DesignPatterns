package com.roroldo.creationalPatterns.singleton.way4;

/**
 * 懒汉式（线程安全——同步方法）
 * 缺点：效率低，需要同步的只有判断那
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
    private static Singleton instance;

    // 提供一个给外部使用的静态方法，需要使用时才提供实例对象
    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
