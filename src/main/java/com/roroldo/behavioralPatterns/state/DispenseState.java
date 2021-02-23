package com.roroldo.behavioralPatterns.state;

import lombok.AllArgsConstructor;

/**
 * 发放奖品的状态
 * @author 落霞不孤
 */
@AllArgsConstructor
public class DispenseState implements State {
    private RaffleActivity raffleActivity;

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean isRaffle() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (raffleActivity.getCount() > 0) {
            System.out.println("恭喜您，中奖了~");
            // 改变状态为不能抽奖
            raffleActivity.setCurrentState(raffleActivity.getNoRaffleState());
        } else {
            System.out.println("很遗憾，奖品发送完了");
            // 改变状态为奖品发送完毕, 后面就不可以再抽奖
            raffleActivity.setCurrentState(raffleActivity.getDispenseOutState());
            // System.out.println("抽奖活动结束");
            // System.exit(0);
        }
    }
}
