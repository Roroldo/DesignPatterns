package com.roroldo.behavioralPatterns.visitor;

/**
 * 待定
 * @author 落霞不孤
 */
public class Wait extends Evaluation {
    @Override
    public void getManEvaluation(Man man) {
        System.out.println("男生给的评价是待定。");
    }

    @Override
    public void getWomanEvaluation(Woman man) {
        System.out.println("女生给的评价是待定。");
    }
}
