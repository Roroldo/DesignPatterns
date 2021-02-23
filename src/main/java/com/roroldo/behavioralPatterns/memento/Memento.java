package com.roroldo.behavioralPatterns.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 备忘录
 * @author 落霞不孤
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Memento {
    private int vit;
    private int def;
}
