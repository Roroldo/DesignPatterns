package com.roroldo.structuralPatterns.proxy.staticProxy;

import com.roroldo.structuralPatterns.proxy.domain.UserDaoImpl;

public class Client {
    public static void main(String[] args) {
        UserDaoProxy userDaoProxy = new UserDaoProxy(new UserDaoImpl());
        userDaoProxy.save();
    }
}
