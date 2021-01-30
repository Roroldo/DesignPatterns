package com.roroldo.structuralPatterns.proxy.dynamicProxy;

import com.roroldo.structuralPatterns.proxy.domain.UserDao;
import com.roroldo.structuralPatterns.proxy.domain.UserDaoImpl;

public class Client {
    public static void main(String[] args) {
        UserDao target = new UserDaoImpl();
        UserDao proxy = (UserDao) new ProxyFactory(target).getInstance();
        System.out.println("目标对象" + target.getClass());
        System.out.println("代理对象" + proxy.getClass());
        proxy.save();
    }
}
