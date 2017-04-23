package com.learn.design.factory.simple;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/3 0003
 * Time: 21:20
 *
 * @author Administrator
 * @version 1.0
 */
public class CalculationRide extends Calculation {

    @Override
    protected Double calculation() {
        return getOneNum() * getTwoNum();
    }

    @Override
    protected Double calculation(Double oneNum, Double twoNum) {
        return oneNum * twoNum;
    }

}
