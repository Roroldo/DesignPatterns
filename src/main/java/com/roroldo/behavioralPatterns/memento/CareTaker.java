package com.roroldo.behavioralPatterns.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 守护者：管理备忘录对象
 * @author 落霞不孤
 */
@Setter
@Getter
public class CareTaker {
    // 只保存一次状态
    private Memento memento;
    // private List<Memento> mementos;
    // 对多个游戏角色保存多个状态
    // private Map<String, ArrayList<Memento>> rolesMementos;
}
