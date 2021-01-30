package com.roroldo.structuralPatterns.proxy.cglib;

import lombok.AllArgsConstructor;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理对象工厂
 * @author 落霞不孤
 */
@AllArgsConstructor
public class ProxyFactory implements MethodInterceptor {
    private Object target;

    public Object getInstance() {
        // 创建工具类
        Enhancer enhancer = new Enhancer();
        // 设置父类，对象目标
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        // 返回子类代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib 代理");
        System.out.println("校验用户数据的合法性~");
        Object returnValue = method.invoke(target, args);
        System.out.println("保存成功！");
        return returnValue;
    }
}
