package com.roroldo.behavioralPatterns.memento;

/**
 * 客户端
 * @author 落霞不孤
 */
public class Client {
    public static void main(String[] args) {
        GameRole liBai = new GameRole("李白", 300, 300);
        System.out.print("打龙前的状态：");
        liBai.display();
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(liBai.createMemento());
        System.out.print("打完龙之后的状态：");
        liBai.setVit(200);
        liBai.setDef(250);
        liBai.display();
        System.out.print("使用药物，通过备忘录对象恢复状态：");
        liBai.recoverGameRoleFromMemento(careTaker.getMemento());
        liBai.display();
    }
}
