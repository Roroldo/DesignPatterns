package com.roroldo.behavioralPatterns.state;

import lombok.Data;

/**
 * 抽奖活动
 * @author 落霞不孤
 */
@Data
public class RaffleActivity {
    /**
     * 奖品数量
     */
    private int count;

    /**
     * 当前活动状态
     */
    private State currentState;

    /**
     * 四个活动状态
     */
    private State noRaffleState = new NoRaffleState(this);
    private State canRaffleState = new CanRaffleState(this);
    private State dispenseState =	new DispenseState(this);
    private State dispenseOutState = new DispenseOutState(this);

    /**
     * 活动初始化
     * @param count 奖品数量
     */
    public RaffleActivity(int count) {
        this.count = count;
        this.currentState = getNoRaffleState();
    }

    /**
     * 扣除积分
     */
    public void deductMoney() {
        this.currentState.deductMoney();;
    }

    /**
     * 抽奖成功
     */
    public void raffle() {
        if (currentState.isRaffle()) {
            currentState.dispensePrize();
        }
    }

    public int getCount() {
        this.count--;
        return this.count;
    }
}
