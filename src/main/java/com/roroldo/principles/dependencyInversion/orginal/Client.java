package com.roroldo.principles.dependencyInversion.orginal;

/**
 * 客户端
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
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }

    // 想获得qq消息 又得写多一个方法了。。。
    public void receive(Qq qq) {
        System.out.println(qq.getInfo());
    }
}

/**
 * 邮件
 */
class Email {
    public String getInfo() {
        return "谷歌邮件：ding~ 您收到一封新的邮件..";
    }
}

/**
 * QQ
 */
class Qq {
    public String getInfo() {
        return "QQ：您的特殊关心发表了新的空间，点击查看~";
    }
}


