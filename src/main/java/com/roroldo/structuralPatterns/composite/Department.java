package com.roroldo.structuralPatterns.composite;


import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 专业（系）
 * @author 落霞不孤
 */

@AllArgsConstructor
public class Department extends OrganizationComponent{
    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void print() {
        System.out.println(this.getName() + " " + this.getDesc());
    }
}
