package com.roroldo.structuralPatterns.proxy.dynamicProxy;

import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理对象工厂
 * @author 落霞不孤
 */
@AllArgsConstructor
public class ProxyFactory {
    private Object target;

    public Object getInstance() {
        // 参数1：目标对象的类加载器
        // 参数2：目标对象实现的全部接口
        // 参数3：调用处理器
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("动态代理");
                System.out.println("校验用户数据的合法性~");
                // 执行目标方法，传入目标对象和参数
                Object returnValue = method.invoke(target, args);
                System.out.println("保存成功！");
                // 目标方法的返回值
                return returnValue;
            }
        });
    }
}
