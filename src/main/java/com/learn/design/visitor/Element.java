package com.learn.design.visitor;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/2/2 0002
 * Time: 14:17
 *
 * @author Administrator
 * @version 1.0
 */
public abstract class Element {

    abstract void accept(Visitor visitor);

}
