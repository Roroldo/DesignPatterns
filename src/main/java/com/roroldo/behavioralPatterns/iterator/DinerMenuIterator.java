package com.roroldo.behavioralPatterns.iterator;

import java.util.Iterator;

/**
 * 餐厅菜单迭代器
 * @author 落霞不孤
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
    private MenuItem[] menuItems;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }


    @Override
    public boolean hasNext() {
        if (position < menuItems.length) {
            return true;
        }
        return false;
    }

    @Override
    public MenuItem next() {
        if (!this.hasNext()) {
            return null;
        }
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
