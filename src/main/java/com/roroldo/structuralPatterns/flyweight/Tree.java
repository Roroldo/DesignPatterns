package com.roroldo.structuralPatterns.flyweight;

import lombok.AllArgsConstructor;

import java.awt.*;

/**
 * 树
 * @author 落霞不孤
 */
@AllArgsConstructor
public class Tree {
    private int x;
    private int y;
    private TreeType type;


    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
