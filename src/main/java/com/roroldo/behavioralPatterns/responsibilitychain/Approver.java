package com.roroldo.behavioralPatterns.responsibilitychain;

import lombok.Setter;

/**
 * 处理者
 * @author 落霞不孤
 */
@Setter
public abstract class Approver {
    protected Approver approver;
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    /**
     * 处理请求
     * @param purchaseRequest 请求
     */
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
