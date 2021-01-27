package com.roroldo.creationalPatterns.prototype.orginal;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 小羊类
 * @author 落霞不孤
 */
@Data
@NoArgsConstructor
public class Sheep implements Cloneable{
    private String name;
    private int age;
    // 引用对象
    private Sheep friend;

    public Sheep(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Sheep(String name, int age, Sheep friend) {
        this(name, age);
        this.friend = friend;
    }

    // 通过实现 Cloneable 实现对象的浅拷贝
    @Override
    public Sheep clone() throws CloneNotSupportedException {
        return (Sheep) super.clone();
    }
}
