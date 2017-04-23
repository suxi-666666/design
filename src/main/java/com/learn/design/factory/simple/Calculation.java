package com.learn.design.factory.simple;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/3 0003
 * Time: 21:13
 *
 * @author Administrator
 * @version 1.0
 */
public abstract class Calculation {

    private Double oneNum;
    private Double twoNum;

    public Double getOneNum() {
        if (oneNum == null) oneNum = 0.;
        return oneNum;
    }

    public void setOneNum(Double oneNum) {
        this.oneNum = oneNum;
    }

    public Double getTwoNum() {
        if (twoNum == null) twoNum = 0.;
        return twoNum;
    }

    public void setTwoNum(Double twoNum) {
        this.twoNum = twoNum;
    }

    protected abstract Double calculation(Double oneNum, Double twoNum);

    protected abstract Double calculation();

}
