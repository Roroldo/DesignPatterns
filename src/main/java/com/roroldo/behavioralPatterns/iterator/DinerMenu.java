package com.roroldo.behavioralPatterns.iterator;

import java.util.Iterator;

/**
 * 餐厅菜单
 * @author 落霞不孤
 */
public class DinerMenu extends Menu{
    private MenuItem[] menuItems;

    public DinerMenu() {
        this.setMenuName("餐厅");
        this.menuItems = new MenuItem[3];
        menuItems[0] = new MenuItem("干炒牛河", 8.0);
        menuItems[1] = new MenuItem("云吞", 8.0);
        menuItems[2] = new MenuItem("鸡蛋肠粉", 4.0);
    }

    @Override
    protected Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
