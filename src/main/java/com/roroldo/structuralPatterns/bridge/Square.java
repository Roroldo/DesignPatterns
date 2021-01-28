package com.roroldo.structuralPatterns.bridge;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 正方形
 * @author 落霞不孤
 */
@NoArgsConstructor
public class Square extends AbstractShape{
    public Square(IColor iColor) {
        super(iColor);
    }

    @Override
    public void draw() {
        System.out.print("画正方形 ");
        if (iColor != null) {
            iColor.paint();
        }
        System.out.println();
    }
}
