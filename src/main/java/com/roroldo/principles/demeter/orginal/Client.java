package com.roroldo.principles.demeter.orginal;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特原则
 * @author 落霞不孤
 */
public class Client {
    public static void main(String[] args) {
        // 创建了一个 SchoolManager 对象
        SchoolManager schoolManager = new SchoolManager();
        // 输出学院和学校总部的员工信息
        schoolManager.printAllEmployee(new CollegeManager());
    }
}


/*学校员工*/
class SchoolEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

/*学院员工*/
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 学院管理处：管理学院员工
class CollegeManager {
    // 返回学院所有的员工
    public List<CollegeEmployee> getAllCollegeEmployee() {
        List<CollegeEmployee> collegeEmployeeList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            CollegeEmployee employee = new CollegeEmployee();
            employee.setId("学院员工id：" + i);
            collegeEmployeeList.add(employee);
        }
        return collegeEmployeeList;
    }
}

// 学校管理处：管理学院和校级员工
class SchoolManager {
    // 返回学校所有的员工
    public List<SchoolEmployee> getAllSchoolEmployee() {
        List<SchoolEmployee> schoolEmployeeList = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            SchoolEmployee employee = new SchoolEmployee();
            employee.setId("学校员工id：" + i);
            schoolEmployeeList.add(employee);
        }
        return schoolEmployeeList;
    }

    // 打印校级员工信息
    public void printAllSchoolEmployee() {
        List<SchoolEmployee> allSchoolEmployee = this.getAllSchoolEmployee();
        for (SchoolEmployee schoolEmployee : allSchoolEmployee) {
            System.out.println(schoolEmployee.getId());
        }
    }

    // 打印学校所有员工信息（院级 + 校级）
    public void printAllEmployee(CollegeManager collegeManager) {
        // 这里的CollegeEmployee不是SchoolManager的直接朋友 即陌生朋友
        List<CollegeEmployee> allCollegeEmployee = collegeManager.getAllCollegeEmployee();
        System.out.println("-----学院员工-----");
        for (CollegeEmployee collegeEmployee : allCollegeEmployee) {
            System.out.println(collegeEmployee.getId());
        }
        System.out.println("-----学校员工-----");
        this.printAllSchoolEmployee();
    }
}