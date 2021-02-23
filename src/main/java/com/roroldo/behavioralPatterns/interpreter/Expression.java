package com.roroldo.behavioralPatterns.interpreter;

import java.util.Map;

/**
 * 抽象表达式
 * @author 落霞不孤
 */
public abstract class Expression {
    /**
     * 解释公式和数值，key 是表达式，value 是数值
     * @param var 参数
     * @return 计算结果
     */
    abstract int interpreter(Map<String, Integer> var);
}
