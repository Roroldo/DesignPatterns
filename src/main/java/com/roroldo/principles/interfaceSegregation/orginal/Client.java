package com.roroldo.principles.interfaceSegregation.orginal;

/**
 * 接口隔离原则原始版本
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

interface InterfaceAll {
    void method1();
    void method2();
    void method3();
    void method4();
    void method5();
}

class B implements InterfaceAll {

    @Override
    public void method1() {
        System.out.println("B 实现了 InterfaceAll 的 method1");
    }

    @Override
    public void method2() {
        System.out.println("B 实现了 InterfaceAll 的 method2");
    }

    @Override
    public void method3() {
        System.out.println("B 实现了 InterfaceAll 的 method3");
    }

    @Override
    public void method4() {
        System.out.println("B 实现了 InterfaceAll 的 method4");
    }

    @Override
    public void method5() {
        System.out.println("B 实现了 InterfaceAll 的 method5");
    }
}

class D implements InterfaceAll {

    @Override
    public void method1() {
        System.out.println("D 实现了 InterfaceAll 的 method1");
    }

    @Override
    public void method2() {
        System.out.println("D 实现了 InterfaceAll 的 method2");
    }

    @Override
    public void method3() {
        System.out.println("D 实现了 InterfaceAll 的 method300000000000");
    }

    @Override
    public void method4() {
        System.out.println("D 实现了 InterfaceAll 的 method4");
    }

    @Override
    public void method5() {
        System.out.println("D 实现了 InterfaceAll 的 method5");
    }
}

class A {
    public void depend1(InterfaceAll i) {
        System.out.print("A 使用了 ");
        i.method1();
    }

    public void depend2(InterfaceAll i) {
        System.out.print("A 使用了 ");
        i.method2();
    }

    public void depend3(InterfaceAll i) {
        System.out.print("A 使用了 ");
        i.method3();
    }
}

class C {
    public void depend1(InterfaceAll i) {
        System.out.print("C 使用了 ");
        i.method1();
    }

    public void depend4(InterfaceAll i) {
        System.out.print("C 使用了 ");
        i.method4();
    }

    public void depend5(InterfaceAll i) {
        System.out.print("C 使用了 ");
        i.method5();
    }
}



