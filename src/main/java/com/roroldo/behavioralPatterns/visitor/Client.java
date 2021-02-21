package com.roroldo.behavioralPatterns.visitor;

/**
 * 客户端
 * @author 落霞不孤
 */
public class Client {
    public static void main(String[] args) {
        AudienceStructure audienceStructure = new AudienceStructure();
        audienceStructure.attach(new Man());
        audienceStructure.attach(new Woman());

        Success success = new Success();
        audienceStructure.display(success);
        System.out.println("========================");
        Fail fail = new Fail();
        audienceStructure.display(fail);
        System.out.println("========================");
        Wait wait = new Wait();
        audienceStructure.display(wait);
    }
}
