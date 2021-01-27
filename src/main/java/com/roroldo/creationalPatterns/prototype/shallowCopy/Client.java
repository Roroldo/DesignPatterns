package com.roroldo.creationalPatterns.prototype.shallowCopy;

import com.roroldo.creationalPatterns.prototype.orginal.Sheep;

/**
 * 浅拷贝实现克隆羊
 * @author 落霞不孤
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("喜羊羊", 12);
        sheep.setFriend(new Sheep("美羊羊", 11));

        // 克隆羊
        Sheep cloneSheep = sheep.clone();
        System.out.println(sheep);
        System.out.println(cloneSheep);
        System.out.println(sheep == cloneSheep);
        System.out.println("比较原型对象和克隆对象引用类型: " + (sheep.getFriend() == cloneSheep.getFriend()));
    }
}
