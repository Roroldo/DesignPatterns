package com.roroldo.behavioralPatterns.visitor;

/**
 * 成功
 * @author 落霞不孤
 */
public class Success extends Evaluation {
    @Override
    public void getManEvaluation(Man man) {
        System.out.println("男生给的评价是成功。");
    }

    @Override
    public void getWomanEvaluation(Woman man) {
        System.out.println("女生给的评价是成功。");
    }
}
