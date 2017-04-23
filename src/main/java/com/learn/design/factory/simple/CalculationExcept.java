package com.learn.design.factory.simple;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/3 0003
 * Time: 21:21
 *
 * @author Administrator
 * @version 1.0
 */
public class CalculationExcept extends Calculation {

    @Override
    protected Double calculation() {
        validate();
        return getOneNum() / getTwoNum();
    }

    @Override
    protected Double calculation(Double oneNum, Double twoNum) {
        validate();
        return oneNum / twoNum;
    }

    public void validate() {
        try {
            if (getOneNum() == 0 && getTwoNum() == 0) setTwoNum(1.0);
            else if (getTwoNum() == 0) throw new Exception("被除数不能为零.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
