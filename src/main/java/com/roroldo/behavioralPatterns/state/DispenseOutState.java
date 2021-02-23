package com.roroldo.behavioralPatterns.state;

import lombok.AllArgsConstructor;

/**
 * 奖品发送完毕的状态
 * @author 落霞不孤
 */
@AllArgsConstructor
public class DispenseOutState implements State {
    private RaffleActivity raffleActivity;

    @Override
    public void deductMoney() {
        System.out.println("奖品发送完了，请下次再参加");
    }

    @Override
    public boolean isRaffle() {
        System.out.println("奖品发送完了，请下次再参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了，请下次再参加");
    }
}
