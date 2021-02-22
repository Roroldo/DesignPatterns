package com.roroldo.behavioralPatterns.iterator;

import lombok.Getter;
import lombok.Setter;

import java.util.Iterator;

/**
 * 菜单
 * @author 落霞不孤
 */
@Setter
@Getter
public abstract class Menu {
    private String menuName;

    protected abstract Iterator<MenuItem> createIterator();
}
