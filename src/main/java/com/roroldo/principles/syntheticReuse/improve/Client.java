package com.roroldo.principles.syntheticReuse.improve;

public class Client {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        userDao.setBaseDBConnection(new MySQLConnection());
        userDao.findById(1);

        userDao.setBaseDBConnection(new OracleConnection());
        userDao.findById(1);
    }
}

/*基本数据库连接抽象类*/
abstract class BaseDBConnection {

    abstract String getConnection();
}

class MySQLConnection extends BaseDBConnection {
    @Override
    String getConnection() {
        return "使用 MySQL 数据库连接";
    }
}

class UserDao {
    private BaseDBConnection baseDBConnection;

    public BaseDBConnection getBaseDBConnection() {
        return baseDBConnection;
    }

    public void findById(int id) {
        System.out.println(baseDBConnection.getConnection() + "查找用户" + id);
    }

    public void setBaseDBConnection(BaseDBConnection baseDBConnection) {
        this.baseDBConnection = baseDBConnection;
    }
}

/*这时候我们把数据库换成Oracle的 并不用去修改代码了*/
class OracleConnection extends BaseDBConnection {
    @Override
    public String getConnection() {
        return "使用 oracle 数据库连接";
    }
}