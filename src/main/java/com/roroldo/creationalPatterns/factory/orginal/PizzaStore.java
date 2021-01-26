package com.roroldo.creationalPatterns.factory.orginal;

import com.roroldo.creationalPatterns.factory.domain.AbstractPizza;
import com.roroldo.creationalPatterns.factory.domain.CheesePizza;
import com.roroldo.creationalPatterns.factory.domain.GreekPizza;
import com.roroldo.creationalPatterns.factory.domain.PepperPizza;
import lombok.NoArgsConstructor;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * 订购 pizza 商店类
 * @author 落霞不孤
 */
@NoArgsConstructor
public class PizzaStore {

    public AbstractPizza orderPizza() {
        AbstractPizza abstractPizza = null;
        String orderPizzaType;
        orderPizzaType = getPizzaType();
        if ("greek".equals(orderPizzaType)) {
            abstractPizza = new GreekPizza();
        }
        else if ("cheese".equals(orderPizzaType)) {
            abstractPizza = new CheesePizza();
            // 每新增加一个披萨类型，都要修改订购披萨类
        } else if ("pepper".equals(orderPizzaType)) {
            abstractPizza = new PepperPizza();
        } else {
            System.out.println("没有您定制的披萨类型");
            return null;
        }
        abstractPizza.prepare();
        abstractPizza.bake();
        abstractPizza.cut();
        abstractPizza.box();
        return abstractPizza;
    }


    private String getPizzaType() {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入需要订购的披萨类型：");
        return in.nextLine();
    }
}
