package com.roroldo.creationalPatterns.prototype.deepCopy;


import java.io.IOException;

/**
 * 深拷贝实现克隆羊
 * @author 落霞不孤
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, IOException {
        Sheep sheep = new Sheep("喜羊羊", 12);
        sheep.setFriend(new Sheep("美羊羊", 11));

        // 克隆羊方式一
        Sheep cloneSheep1 = sheep.clone();
        System.out.println(sheep);
        System.out.println(cloneSheep1);
        System.out.println(sheep == cloneSheep1);
        System.out.println("比较原型对象和克隆对象引用类型: " + (sheep.getFriend() == cloneSheep1.getFriend()));
        System.out.println("%======================================%");
        // 克隆羊方式2
        Sheep cloneSheep2 = sheep.deepCopyClone();
        System.out.println(sheep);
        System.out.println(cloneSheep2);
        System.out.println(sheep == cloneSheep2);
        System.out.println("比较原型对象和克隆对象引用类型: " + (sheep.getFriend() == cloneSheep2.getFriend()));


    }
}
