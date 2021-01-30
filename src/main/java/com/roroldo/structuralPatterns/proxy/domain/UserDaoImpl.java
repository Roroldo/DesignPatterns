package com.roroldo.structuralPatterns.proxy.domain;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("保存用户数据...");
    }
}
