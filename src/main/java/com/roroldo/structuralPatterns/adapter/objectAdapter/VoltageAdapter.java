package com.roroldo.structuralPatterns.adapter.objectAdapter;

import com.roroldo.structuralPatterns.adapter.domain.*;
import lombok.AllArgsConstructor;

/**
 * 使用对象适配方式的类适配器
 * @author 落霞不孤
 */
@AllArgsConstructor
public class VoltageAdapter	implements Voltage5 {

    private Voltage220 voltage220V;


    @Override
    public int output5() {
        int dst = 0;
        if(voltage220V != null) {
            //获取 220V 电压
            System.out.println("使用对象适配器，进行适配");
            int src = voltage220V.output220V();
            dst = src / 44;
            System.out.println("适配完成，输出的电压为 " + dst + "V");
        }
        return dst;
    }
}
