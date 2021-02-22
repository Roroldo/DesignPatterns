package com.roroldo.behavioralPatterns.iterator;

import java.util.Iterator;

/**
 * 女服务员
 * @author 落霞不孤
 */
public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;

    public Waitress() {
        this.pancakeHouseMenu = new PancakeHouseMenu();
        this.dinerMenu = new DinerMenu();
    }

    public void showAllMenuItems() {
        // 获取煎饼店和餐厅菜单迭代器
        Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();
        // 打印菜品
        System.out.println("****************" + pancakeHouseMenu.getMenuName() + "*************");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("****************" + dinerMenu.getMenuName() + "*************");
        printMenu(dinerMenuIterator);
    }

    private void printMenu(Iterator<MenuItem> itemIterator) {
        while (itemIterator.hasNext()) {
            MenuItem menuItem = itemIterator.next();
            System.out.println(menuItem);
        }
    }
}
