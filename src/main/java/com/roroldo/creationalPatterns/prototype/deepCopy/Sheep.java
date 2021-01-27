package com.roroldo.creationalPatterns.prototype.deepCopy;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

/**
 * 小羊类
 * @author 落霞不孤
 */
@Data
@NoArgsConstructor
public class Sheep implements Cloneable, Serializable {
    private String name;
    private int age;
    // 引用对象
    private Sheep friend;

    public Sheep(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Sheep(String name, int age, Sheep friend) {
        this(name, age);
        this.friend = friend;
    }

    // 深拷贝实现方式一 实现Cloneable 接口的 clone 接口
    @Override
    public Sheep clone() throws CloneNotSupportedException {
        System.out.println("通过实现 Cloneable 实现对象的深拷贝");
        // 对基本数据类型(属性)和 String的克隆
        Sheep cloneSheep = (Sheep) super.clone();
        // 对引用类型的克隆
        if (this.friend != null) {
            cloneSheep.friend = this.friend.clone();
        }
        return cloneSheep;
    }

    // // 深拷贝实现方式二 通过对象的序列化
    public Sheep deepCopyClone() throws IOException {
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;

        try {
            // 对象序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return (Sheep) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                ois.close();
            }
            if (bis != null) {
                bis.close();
            }
            if (oos != null) {
                oos.close();
            }
            if (bos != null) {
                bos.close();
            }
        }
        return null;
    }
}
