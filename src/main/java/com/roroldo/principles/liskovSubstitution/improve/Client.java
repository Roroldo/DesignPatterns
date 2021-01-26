package com.roroldo.principles.liskovSubstitution.improve;

public class Client {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("a.sum = " + a.sum(3, 4));
        System.out.println("---------");
        B b = new B();
        // 原意是求3，4, 5的和
        System.out.println("b.sum = " + b.sum(3, 4, 5));

    }
}

//创建一个更加基础的基类
class Base {
    //把更加基础的方法和成员写到 Base类
}

class A extends Base{
    public int sum(int a, int b) {
        return a + b;
    }
}

class B extends Base {
    // 如果 B 需要使用 A 类的方法,使用组合关系
    private A a = new A();

    public int sum(int a, int b, int c) {
        return this.a.sum(a, b) + c;
    }

    // 还想使用A的方法的话 直接 this.a.method
}


