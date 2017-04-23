package com.learn.design.midator;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/29 0029
 * Time: 9:07
 *
 * @author Administrator
 * @version 1.0
 */
public class CountryUSA extends Country {

    public CountryUSA(UnitedNations unitedNations) {
        super(unitedNations);
    }

    public void declare(String message) {
        unitedNations.declare(message, this);
    }

    @Override
    void getMessage(String message) {
        System.out.format("美国获得消息: " + message);
    }

}
