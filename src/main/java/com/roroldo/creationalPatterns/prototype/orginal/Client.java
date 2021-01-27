package com.roroldo.creationalPatterns.prototype.orginal;


/**
 * 传统办法克隆羊
 * @author 落霞不孤
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("懒羊羊", 12);

        // 克隆开始
        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge());
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge());
        System.out.println("原来的小羊：" + sheep);
        System.out.println("克隆羊 1 号：" + sheep1);
        System.out.println("克隆羊 2 号：" + sheep2);
    }
}
