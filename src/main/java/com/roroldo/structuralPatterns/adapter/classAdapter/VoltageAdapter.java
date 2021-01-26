package com.roroldo.structuralPatterns.adapter.classAdapter;

import com.roroldo.structuralPatterns.adapter.domain.Voltage220;
import com.roroldo.structuralPatterns.adapter.domain.Voltage5;

/**
 * 通过类适配方式实现的适配器类
 * @author 落霞不孤
 */
public class VoltageAdapter extends Voltage220 implements Voltage5 {

    @Override
    public int output5() {
        int dst = 0;
        //获取 220V 电压
        System.out.println("使用类适配器，进行适配");
        int src = output220V();
        dst = src / 44;
        System.out.println("适配完成，输出的电压为 " + dst + "V");
        return dst;
    }
}
