package com.roroldo.structuralPatterns.composite;

import lombok.*;

/**
 * 组织组件
 * @author 落霞不孤
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class OrganizationComponent {
    private String name;
    private String desc;

    public void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    public OrganizationComponent remove(OrganizationComponent organizationComponent) {
        return organizationComponent;
    }

    public abstract void print();
}
