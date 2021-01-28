package com.roroldo.structuralPatterns.composite;

public class Client {
    public static void main(String[] args) {
        // 大学
        OrganizationComponent university = new University("桂林理工大学", "坐标桂林，漓江在旁");
        // 学院
        OrganizationComponent scienceCollege = new College("理学院", "探究自然哲学的奥秘~");
        OrganizationComponent computerCollege = new College("计算机学院", "培养 IT 人才~");
        university.add(scienceCollege);
        university.add(computerCollege);
        // 专业
        OrganizationComponent math = new Department("数学专业", "研究数学");
        OrganizationComponent physics = new Department("物理专业", "研究物理");
        scienceCollege.add(math);
        scienceCollege.add(physics);
        OrganizationComponent computerScience = new Department("计算机科学与技术专业", "研究计算机科学");
        OrganizationComponent softwareEngineer = new Department("软件工程", "学习软件工程");
        computerCollege.add(computerScience);
        computerCollege.add(softwareEngineer);

        // 打印大学的树形结构
        university.print();
        System.out.println("移除理学院");
        OrganizationComponent remove = university.remove(scienceCollege);
        university.print();
    }
}
