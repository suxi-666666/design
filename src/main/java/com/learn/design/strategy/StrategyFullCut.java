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
public class StrategyFullCut extends Strategy {

    private Integer full;
    private Integer cut;

    /**
     * 满 full 减 cut
     *
     * @param full
     * @param cut
     */
    public StrategyFullCut(Integer full, Integer cut) {
        this.full = full;
        this.cut = cut;
    }

    @Override
    protected Double acceptCash(Double money) {
        if (money > full) return money - cut;
        return money;
    }

}
