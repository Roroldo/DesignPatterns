package com.roroldo.principles.syntheticReuse.orginal;

/**
 * 合成复用原则
 * @author 落霞不孤
 */
public class Client {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        userDao.findById(1);
    }
}

/*数据库连接类*/
class DBConnection {
    public String getConnection() {
        return "使用 MySQL 数据库连接";
    }
}

/*操作用户表的类*/
class UserDao extends DBConnection {
    public void findById(int id) {
        String connection = super.getConnection();
        System.out.println(connection + "查找用户" + id);
    }
}

/*这时候我们把数据库换成Oracle的，就要去DBUtils修改 违背了开闭原则*/