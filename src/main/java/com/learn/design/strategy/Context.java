package com.learn.design.strategy;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/5 0005
 * Time: 21:16
 *
 * @author Administrator
 * @version 1.0
 */
public class Context {

    private Strategy strategy;

    public Context(EStrategyType type) {
        switch (type) {
            case DISCOUNT:
                strategy = new StrategyDiscount(0.8);
                break;
            case FULL_CUT:
                strategy = new StrategyFullCut(300, 100);
                break;
            case NORMAL:
            default:
                strategy = new StrategyNormal();
        }
    }

    public Double getResult(Double money) {
        return strategy.acceptCash(money);
    }

}
