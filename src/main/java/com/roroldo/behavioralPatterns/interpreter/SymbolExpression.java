package com.roroldo.behavioralPatterns.interpreter;

import lombok.AllArgsConstructor;

import java.util.Map;

/**
 * 符号表达式
 * @author 落霞不孤
 */
@AllArgsConstructor
public class SymbolExpression extends Expression{
    protected Expression left;
    protected Expression right;

    // 由符号表达式的子类实现
    @Override
    int interpreter(Map<String, Integer> var) {
        return 0;
    }
}
