package com.roroldo.behavioralPatterns.visitor;

/**
 * 男观众
 * @author 落霞不孤
 */
public class Man extends Person {
    @Override

    /**
     * 这里使用到了双分派, 即首先在客户端程序中，将具体状态作为参数传递 Man 中 (第一次分派)
     * 然后 Man 类调用作为参数的 "具体方法" 中方法 getManResult, 同时将自己(this)作为参数传入，完成第二次的分派
     */
    public void accept(Evaluation evaluation) {
        evaluation.getManEvaluation(this);
    }
}
