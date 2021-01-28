package com.roroldo.structuralPatterns.composite;


import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 大学
 * @author 落霞不孤
 */

public class University extends OrganizationComponent{
    // 管理学院
    private List<OrganizationComponent> organizationComponentList = new ArrayList<>();

    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void add(OrganizationComponent organizationComponent) {
        organizationComponentList.add(organizationComponent);
    }

    @Override
    public OrganizationComponent remove(OrganizationComponent organizationComponent) {
        organizationComponentList.remove(organizationComponent);
        return organizationComponent;
    }

    @Override
    public void print() {
        System.out.println("-----------" + this.getName() + "  " +this.getDesc() +"----------------");
        for (OrganizationComponent organizationComponent : organizationComponentList) {
            organizationComponent.print();
        }
        System.out.println("------------------------------------------------------");
    }
}
