package com.roroldo.behavioralPatterns.state;

/**
 * 抽奖过程中的状态接口
 * @author 落霞不孤
 */
public interface State {
    /**
     * 扣除积分
     */
    void deductMoney();

    /**
     * 是否抽中奖品
     * @return true 抽中奖品
     */
    boolean isRaffle();

    /**
     * 发送奖品
     */
    void dispensePrize();
}
