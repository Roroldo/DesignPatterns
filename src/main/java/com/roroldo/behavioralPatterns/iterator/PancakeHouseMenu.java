package com.roroldo.behavioralPatterns.iterator;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * 煎饼店菜单
 * @author 落霞不孤
 */

public class PancakeHouseMenu  extends Menu{
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        setMenuName("煎饼店菜单栏");
        this.menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("鸡蛋煎饼", 2.0));
        menuItems.add(new MenuItem("鸡柳煎饼", 4.0));
        menuItems.add(new MenuItem("陕西煎饼", 6.0));
    }

    @Override
    protected Iterator<MenuItem> createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
