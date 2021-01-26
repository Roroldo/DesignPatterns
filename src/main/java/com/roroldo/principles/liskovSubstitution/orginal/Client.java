package com.roroldo.principles.liskovSubstitution.orginal;

/**
 * @author 落霞不孤
 */
public class Client {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("a.sum = " + a.sum(3, 4));
        System.out.println("---------");
        B b = new B();
        // 原意是求3，4的和
        System.out.println("b.sum = " + b.sum(3, 4));
        // 原意是求3，4, 5的和
        System.out.println("b.sum = " + b.sum(3, 4, 5));
    }
}


class A {
    public int sum(int a, int b) {
        return a + b;
    }
}

class B extends A {
    /*无意识的重写了父类的方法*/
    @Override
    public int sum(int a, int b) {
        return a - b;
    }

    /*新功能原意是三个数的和，但无意间被破坏了*/
    public int sum(int a, int b, int c) {
        return this.sum(a, b) + c;
    }
}