package com.roroldo.behavioralPatterns.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 菜品
 * @author 落霞不孤
 */
@Data
@AllArgsConstructor
public class MenuItem {
    private String name;
    private Double price;
}
