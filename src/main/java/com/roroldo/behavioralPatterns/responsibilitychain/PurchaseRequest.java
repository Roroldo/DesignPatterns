package com.roroldo.behavioralPatterns.responsibilitychain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 购买请求
 * @author 落霞不孤
 */
@Data
@AllArgsConstructor
public class PurchaseRequest {
    private int type;
    private double price;
    private int id;
}
