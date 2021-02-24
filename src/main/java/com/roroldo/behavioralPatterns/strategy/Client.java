package com.roroldo.behavioralPatterns.strategy;

/**
 * 客户端
 * @author 落霞不孤
 */
public class Client {
    public static void main(String[] args) {
        // 橡皮鸭
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuark();
        rubberDuck.swim();
        System.out.println("*********************");
        // 可达鸭
        PsyDuck psyDuck = new PsyDuck();
        psyDuck.display();
        psyDuck.performFly();
        psyDuck.performQuark();
        psyDuck.swim();
        System.out.println("*********************");
        // 改变可达鸭为不能飞行
        psyDuck.setFlyBehavior(new FlyNoWay());
        psyDuck.performFly();
    }
}
