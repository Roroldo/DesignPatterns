package com.roroldo.behavioralPatterns.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 游戏角色
 * @author 落霞不孤
 */
@Data
@AllArgsConstructor
public class GameRole {
    private String name;
    private int vit;
    private int def;

    // 备份对象状态
    public Memento createMemento() {
        return new Memento(vit, def);
    }

    // 恢复对象状态
    public void recoverGameRoleFromMemento(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    // 显示游戏人物状态
    public void display() {
        System.out.println("name: " + name + " vit: " + vit + " def: " + def);
    }



}
