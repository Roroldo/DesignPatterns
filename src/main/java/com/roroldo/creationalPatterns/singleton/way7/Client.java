package com.roroldo.creationalPatterns.singleton.way7;

/**
 * 懒汉式（线程安全_静态内部类）
 *     *推荐方式
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

    /**
     * 静态内部类特点：
     *     1. 外部类装载时，内部类不是直接被装载，只有用到才装载
     *     2. 静态内部类只会装载一次，装载时线程是安全的
     */
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    // 提供一个给外部使用的静态方法，需要使用时才提供实例对象
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
