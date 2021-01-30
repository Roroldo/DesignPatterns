package com.roroldo.structuralPatterns.proxy.staticProxy;

import com.roroldo.structuralPatterns.proxy.domain.UserDao;
import lombok.AllArgsConstructor;

/**
 * UserDao 的代理对象
 * @author 落霞不孤
 */
@AllArgsConstructor
public class UserDaoProxy implements UserDao {
    private UserDao target;

    @Override
    public void save() {
        System.out.println("静态代理");
        System.out.println("校验用户数据的合法性~");
        target.save();
        System.out.println("保存成功！");
    }
}
