package com.roroldo.structuralPatterns.bridge;

/**
 * 红颜色
 * @author 落霞不孤
 */
public class Green implements IColor {
    @Override
    public void paint() {
        System.out.println("涂上绿色");
    }
}
