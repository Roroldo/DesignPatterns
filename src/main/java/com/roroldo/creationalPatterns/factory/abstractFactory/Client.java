package com.roroldo.creationalPatterns.factory.abstractFactory;

import java.util.Scanner;

/**
 * 增加了新的需求，披萨店既披萨也卖饮料了，买披萨送饮料，不同地区送的饮料不同
 * @author 落霞不孤
 */
public class Client {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PizzaStore pizzaStore = null;

        System.out.print("请输入您所在的地区: ");
        String address = in.nextLine();
        System.out.print("请输入您定制的披萨类型: ");
        String orderPizzaType = in.nextLine();
        if ("北京".equals(address)) {
            pizzaStore = new BJPizzaStore();
            pizzaStore.createPizza(orderPizzaType);
            pizzaStore.createCoke();
        } else if ("伦敦".equals(address)) {
            pizzaStore = new LDPizzaStore();
            pizzaStore.createPizza(orderPizzaType);
            pizzaStore.createCoke();
        } else {
            System.out.println("输入有误~");
        }
        in.close();
    }
}
