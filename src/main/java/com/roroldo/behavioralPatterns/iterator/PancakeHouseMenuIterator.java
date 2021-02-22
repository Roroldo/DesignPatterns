package com.roroldo.behavioralPatterns.iterator;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 煎饼店菜单迭代器
 * @author 落霞不孤
 */
public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    private ArrayList<MenuItem> menuItems;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size()) {
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        if (!this.hasNext()) {
            return null;
        }
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }

    @Override
    public void remove() {
        menuItems.remove(menuItems.size() - 1);
    }
}
