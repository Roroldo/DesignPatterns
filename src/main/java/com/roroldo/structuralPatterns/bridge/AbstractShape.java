package com.roroldo.structuralPatterns.bridge;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 图形接口
 * @author 落霞不孤
 */

@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractShape{
    protected IColor iColor;

    /**
     * 画图
     */
    public abstract void draw();
}
