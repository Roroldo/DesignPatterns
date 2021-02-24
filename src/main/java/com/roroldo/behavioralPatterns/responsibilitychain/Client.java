package com.roroldo.behavioralPatterns.responsibilitychain;

/**
 * 客户端
 * @author 落霞不孤
 */
public class Client {
    public static void main(String[] args) {
        // 创建请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 3000, 1);
        // 创建审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        ColleagueApprover colleagueApprover = new ColleagueApprover("王院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("佟校长");

        // 将各个审批级别的下一个设置好 (这里将审批的链构成环形)
        departmentApprover.setApprover(colleagueApprover);
        colleagueApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(purchaseRequest);
    }
}
