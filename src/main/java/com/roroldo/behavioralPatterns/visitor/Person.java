package com.roroldo.behavioralPatterns.visitor;

/**
 * 人
 * @author 落霞不孤
 */
public abstract class Person {

    /**
     * 提供让访问者访问的方法
     * @param evaluation 评价
     */
    public abstract void accept(Evaluation evaluation);
}
