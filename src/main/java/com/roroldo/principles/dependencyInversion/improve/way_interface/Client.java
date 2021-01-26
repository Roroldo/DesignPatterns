package com.roroldo.principles.dependencyInversion.improve.way_interface;

/**
 * 接口方式
 * @author 落霞不孤
 */
public class Client {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.receive(new Email());
        mobilePhone.receive(new Qq());
    }
}

/**
 * 手机类 接受消息
 */
class MobilePhone {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}

/**
 * 接受消息抽象接口
 */
interface IReceiver {
    String getInfo();
}

/**
 * 邮件
 */
class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "谷歌邮件：ding~ 您收到一封新的邮件..";
    }
}

/**
 * QQ
 */
class Qq implements IReceiver{
    @Override
    public String getInfo() {
        return "QQ：您的特殊关心发表了新的空间，点击查看~";
    }
}
