package com.roroldo.behavioralPatterns.visitor;

/**
 * 女观众
 * @author 落霞不孤
 */
public class Woman extends Person {
    @Override
    public void accept(Evaluation evaluation) {
        evaluation.getWomanEvaluation(this);
    }
}
