package com.roroldo.behavioralPatterns.state;

import com.roroldo.structuralPatterns.flyweight.Tree;
import lombok.AllArgsConstructor;

import java.util.Random;

/**
 * 可以抽奖的状态
 * @author 落霞不孤
 */
@AllArgsConstructor
public class CanRaffleState implements State{
    private RaffleActivity raffleActivity;

    @Override
    public void deductMoney() {
        System.out.println("已经扣取过了积分");
    }

    // 可以抽奖，抽完奖后，根据实际情况修改新的状态
    @Override
    public boolean isRaffle() {
        System.out.println("正在抽奖，请稍等！");
        Random random = new Random();
        int num = random.nextInt(10);
        // 中将
        if (num == 0) {
            // 修改活动状态为发送奖品
            raffleActivity.setCurrentState(raffleActivity.getDispenseState());
            return true;
        } else {
            System.out.println("很遗憾，没有抽中奖品！");
            // 修改活动状态为不能抽奖
            raffleActivity.setCurrentState(raffleActivity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("没有中将，不能发送奖品");
    }
}
