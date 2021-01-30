package com.roroldo.behavioralPatterns.templateMethod;

import java.util.Scanner;

/**
 * 咖啡因饮料
 * @author 落霞不孤
 */
public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        } else {
            System.out.println("请享用吧~");
        }
    }

    private void boilWater() {
        System.out.println("烧水...");
    }

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("装入杯子...");
    }

    protected abstract void addCondiments();

    // 钩子函数
    protected boolean customerWantsCondiments() {
        String answer = getUserInput();
        if ("yes".equalsIgnoreCase(answer)) {
            return true;
        }
        return false;
    }

    private String getUserInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("你想加入配料吗？Yes or No");
        return in.nextLine();
    }
}
