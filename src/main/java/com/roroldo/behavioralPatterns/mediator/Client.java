package com.roroldo.behavioralPatterns.mediator;

/**
 * 客户端
 * @author 落霞不孤
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个中介者对象
        Mediator mediator = new ConcreteMediator();
        //创建 Alarm，并且加入到	ConcreteMediator 对象的 HashMap
        Alarm alarm = new Alarm(mediator, "alarm");
        //创建 CoffeeMachine 对象，并且加入到 ConcreteMediator 对象的 HashMap
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
        //创建 Curtains , 并且加入到	ConcreteMediator 对象的 HashMap
        Curtains curtains = new Curtains(mediator, "curtains");
        TV tV = new TV(mediator, "TV");
        //让闹钟发出消息alarm.SendAlarm(0);
        coffeeMachine.finishCoffee();
        alarm.sendAlarm(1);
    }
}
