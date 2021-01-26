package com.roroldo.creationalPatterns.factory.factoryMethod;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PizzaStore pizzaStore = null;

        System.out.print("请输入您所在的地区:");
        String address = in.nextLine();
        if ("北京".equals(address)) {
            pizzaStore = new BJPizzaStore();
            pizzaStore.orderPizza();
        } else if ("伦敦".equals(address)) {
            pizzaStore = new LDPizzaStore();
            pizzaStore.orderPizza();
        } else {
            System.out.println("输入有误~");
        }
        in.close();
    }
}
