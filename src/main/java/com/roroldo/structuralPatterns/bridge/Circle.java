package com.roroldo.structuralPatterns.bridge;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 圆形
 * @author 落霞不孤
 */
@NoArgsConstructor
public class Circle extends AbstractShape{

    public Circle(IColor iColor) {
        super(iColor);
    }

    @Override
    public void draw() {
        System.out.print("画⚪形 ");
        if (iColor != null) {
            iColor.paint();
        }
        System.out.println();
    }
}
