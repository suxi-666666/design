package com.learn.design.strategy;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/5 0005
 * Time: 21:03
 *
 * @author Administrator
 * @version 1.0
 */
public class StrategyDiscount extends Strategy {

    private Double discount = 1d;

    /**
     * 打 discount 折
     *
     * @param discount
     */
    public StrategyDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    protected Double acceptCash(Double money) {
        return money * discount;
    }

}
