package com.learn.design.midator;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/29 0029
 * Time: 9:06
 *
 * @author Administrator
 * @version 1.0
 */
public abstract class Country {

    protected UnitedNations unitedNations;

    public Country(UnitedNations unitedNations) {
        this.unitedNations = unitedNations;
    }

    abstract void getMessage(String message);

}
