package com.roroldo.behavioralPatterns.interpreter;

import lombok.AllArgsConstructor;

import java.util.Map;

/**
 * 变量表达式
 * @author 落霞不孤
 */
@AllArgsConstructor
public class VarExpression extends Expression{
    private String key;

    //  interpreter 根据变量名称，返回对应值
    @Override
    int interpreter(Map<String, Integer> var) {
        return var.get(this.key);
    }
}
