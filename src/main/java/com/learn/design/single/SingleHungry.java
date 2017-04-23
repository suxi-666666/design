package com.learn.design.single;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/24 0024
 * Time: 22:12
 *
 * @author Administrator
 * @version 1.0
 */
public final class SingleHungry {

    private static final SingleHungry SINGLE_HUNGRY = new SingleHungry();

    private SingleHungry() {

    }

    public static SingleHungry getInstance() {
        return SINGLE_HUNGRY;
    }

}
