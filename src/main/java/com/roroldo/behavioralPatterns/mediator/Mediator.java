package com.roroldo.behavioralPatterns.mediator;

/**
 * 中介者
 * @author 落霞不孤
 */
public abstract class Mediator {
    // 将与中介者接触的对象加入到集合中
    abstract void register(String colleagueName, Colleague colleague);
    // 接收与中介者接触的对象发出消息
    abstract void getMessage(int stateChange, String colleagueName);
    // 中介者发出消息给客户端
    abstract void sendMessage();
}
