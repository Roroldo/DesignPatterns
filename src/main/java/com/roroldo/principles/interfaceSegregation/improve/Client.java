package com.roroldo.principles.interfaceSegregation.improve;

/**
 * 接口隔离原则优化版
 * @author 落霞不孤
 */
public class Client {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.depend1(b);
        a.depend2(b);
        a.depend3(b);

        C c = new C();
        D d = new D();
        c.depend1(d);
        c.depend4(d);
        c.depend5(d);
    }
}

interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
    void method3();
}

interface Interface3 {
    void method4();
    void method5();
}

class B implements Interface1, Interface2 {

    @Override
    public void method1() {
        System.out.println("B 实现了 Interface1 的 method1");
    }

    @Override
    public void method2() {
        System.out.println("B 实现了 Interface2 的 method2");
    }

    @Override
    public void method3() {
        System.out.println("B 实现了 Interface2 的 method3");
    }
}

class D implements Interface1, Interface3 {

    @Override
    public void method1() {
        System.out.println("D 实现了 Interface1 的 method1");
    }

    @Override
    public void method4() {
        System.out.println("D 实现了 Interface3 的 method4");
    }

    @Override
    public void method5() {
        System.out.println("D 实现了 Interface3 的 method5");
    }
}

class A {
    public void depend1(Interface1 i1) {
        System.out.print("A 使用了 ");
        i1.method1();
    }

    public void depend2(Interface2 i2) {
        System.out.print("A 使用了 ");
        i2.method2();
    }

    public void depend3(Interface2 i2) {
        System.out.print("A 使用了 ");
        i2.method3();
    }
}

class C {
    public void depend1(Interface1 i1) {
        System.out.print("C 使用了 ");
        i1.method1();
    }

    public void depend4(Interface3 i3) {
        System.out.print("C 使用了 ");
        i3.method4();
    }

    public void depend5(Interface3 i3) {
        System.out.print("C 使用了 ");
        i3.method5();
    }
}