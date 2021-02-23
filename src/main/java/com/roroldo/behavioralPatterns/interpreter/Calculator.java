package com.roroldo.behavioralPatterns.interpreter;

import java.util.Map;
import java.util.Stack;

/**
 * 计算器
 * @author 落霞不孤
 */

public class Calculator {
    /** 表达式 */
    private Expression expression;

    public Calculator(String expStr) {
        Stack<Expression> stack = new Stack<>();
        // a + b
        char[] charArray = expStr.toCharArray();
        Expression left = null;
        Expression right = null;

        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    // 从 stack 取 出 left => "a"
                    left = stack.pop();
                    // 取出右表达式 "b"
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    // 然后根据得到 left 和 right 构建 AddExpression 加入 stack
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    // 如果是一个 var 就创建 VarExpression 对象，并 push 到 stack
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
            }
        }
        // 保存最后的结果表达式
        this.expression = stack.pop();
    }

    public int run(Map<String, Integer> var) {
        // 计算结果
        return this.expression.interpreter(var);
    }
}
