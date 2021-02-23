package com.roroldo.behavioralPatterns.state;

import lombok.AllArgsConstructor;

/**
 * 不能抽奖的状态
 * @author 落霞不孤
 */
@AllArgsConstructor
public class NoRaffleState implements State{
    private RaffleActivity raffleActivity;

    @Override
    public void deductMoney() {
        System.out.println("扣除 50 积分成功，您可以抽奖了");
        raffleActivity.setCurrentState(raffleActivity.getCanRaffleState());
    }

    @Override
    public boolean isRaffle() {
        System.out.println("扣了积分才能抽奖喔！");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
