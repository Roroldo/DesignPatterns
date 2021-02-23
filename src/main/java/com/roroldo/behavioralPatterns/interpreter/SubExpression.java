package com.roroldo.behavioralPatterns.interpreter;

import java.util.Map;

/**
 * 减法解释器
 * @author 落霞不孤
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int interpreter(Map<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
