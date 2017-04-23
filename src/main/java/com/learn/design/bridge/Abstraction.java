package com.learn.design.bridge;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/25 0025
 * Time: 16:34
 *
 * @author Administrator
 * @version 1.0
 */
public class Abstraction {

    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operation();
    }

}
