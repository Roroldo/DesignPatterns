package com.roroldo.behavioralPatterns.templateMethod;

public class Client {

    public static void main(String[] args) {
        // 咖啡
        System.out.println("--------咖啡--------");
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
        // 茶
        System.out.println("--------茶--------");
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
    }
}


