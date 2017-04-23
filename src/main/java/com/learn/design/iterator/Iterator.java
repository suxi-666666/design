package com.learn.design.iterator;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/24 0024
 * Time: 22:29
 *
 * @author Administrator
 * @version 1.0
 */
public abstract class Iterator {

    abstract Object first();

    abstract Object next();

    abstract Boolean hasNext();

    abstract Object currentItem();

}
