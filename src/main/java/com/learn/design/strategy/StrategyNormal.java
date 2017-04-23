package com.learn.design.strategy;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/5 0005
 * Time: 21:02
 *
 * @author Administrator
 * @version 1.0
 */
public class StrategyNormal extends Strategy {

    /**
     * 正常
     */
    public StrategyNormal() {

    }

    @Override
    protected Double acceptCash(Double money) {
        return money;
    }

}
