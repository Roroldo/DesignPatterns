package com.roroldo.structuralPatterns.decorator;

import com.roroldo.structuralPatterns.decorator.domain.*;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;

/**
 * CoffeeStore
 * @author 落霞不孤
 */
public class CoffeeStore {

    public static void main(String[] args) {
        // 一杯浓 coffee
        Beverage espresso = new Espresso();
        System.out.println("浓 coffee 价格：" + espresso.cost());
        // 加入抹茶
        espresso = new Mocha(espresso);
        System.out.println( espresso.getDesc() + "，价格" + espresso.cost());
        // 加入牛奶
        espresso = new Milk(espresso);
        System.out.println( espresso.getDesc() + "，价格" + espresso.cost());

        Beverage houseBlend = new HouseBlend();
        System.out.println("再来一杯首选 coffee：" + houseBlend.cost());
        // 加入两份牛奶
        houseBlend = new Milk(houseBlend);
        houseBlend = new Milk(houseBlend);
        System.out.println(houseBlend.getDesc() + "，价格" + houseBlend.cost());

        // 就算此时再多一种 coffee类型，也只是扩展 Beverage，不会造成类爆炸
    }
}
