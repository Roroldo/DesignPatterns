package com.roroldo.behavioralPatterns.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 与中介者接触的同事抽象类
 * @author 落霞不孤
 */
@AllArgsConstructor
@Data
public abstract class Colleague {
    protected Mediator mediator;
    protected String name;


    abstract void sendMessage(int stateChange);
}
