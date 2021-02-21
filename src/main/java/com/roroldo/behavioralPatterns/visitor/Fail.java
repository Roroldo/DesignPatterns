package com.roroldo.behavioralPatterns.visitor;

/**
 * 失败
 * @author 落霞不孤
 */
public class Fail extends Evaluation {
    @Override
    public void getManEvaluation(Man man) {
        System.out.println("男生给的评价是失败。");
    }

    @Override
    public void getWomanEvaluation(Woman man) {
        System.out.println("女生给的评价是失败。");
    }
}
