package com.roroldo.structuralPatterns.proxy.cglib;

public class Client {
    public static void main(String[] args) {
        UserDao target = new UserDao();
        UserDao proxy = (UserDao) new ProxyFactory(target).getInstance();
        System.out.println("目标对象" + target.getClass());
        System.out.println("cglib 代理对象" + proxy.getClass());
        proxy.save();
    }
}
