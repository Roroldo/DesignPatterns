package com.roroldo.behavioralPatterns.responsibilitychain;

/**
 * 院长
 * @author 落霞不孤
 */
public class ColleagueApprover extends Approver {
    public ColleagueApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 5000 && purchaseRequest.getPrice() <= 10000) {
            System.out.println("请求编号 id=" + purchaseRequest.getId() + " 被" + this.name + "处理");
        } else {
            approver.processRequest(purchaseRequest);
        }
    }
}
