package com.roroldo.behavioralPatterns.responsibilitychain;

/**
 * 校长
 * @author 落霞不孤
 */
public class SchoolMasterApprover extends Approver {
    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 30000 && purchaseRequest.getPrice() <= 100000) {
            System.out.println("请求编号 id=" + purchaseRequest.getId() + " 被" + this.name + "处理");
        } else {
            System.out.println(this.name + "也处理不了，上报当地教育部处理！");
        }
    }
}
