package com.roroldo.behavioralPatterns.visitor;

/**
 * 评价
 * @author 落霞不孤
 */
public abstract class Evaluation {
    /**
     * 获取男生评价
     * @param man 男生
     */
    public abstract void getManEvaluation(Man man);
    /**
     * 获取女生评价
     * @param man 女生
     */
    public abstract void getWomanEvaluation(Woman man);
}
