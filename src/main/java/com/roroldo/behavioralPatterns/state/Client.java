package com.roroldo.behavioralPatterns.state;

/**
 * 客户端
 * @author 落霞不孤
 */
public class Client {
    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(2);
        for (int i = 0; i < 30; i++) {
            System.out.println("----------第 " + (i + 1) + " 次抽奖----------");
            // 参加抽奖
            // 第一步 扣除积分
            activity.deductMoney();
            // 第二步 抽奖
            activity.raffle();
        }
    }
}
