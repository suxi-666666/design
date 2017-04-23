package com.learn.design.proxy;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/9 0009
 * Time: 20:39
 *
 * @author Administrator
 * @version 1.0
 */
public class RealSubject implements ISubject {

    @Override
    public void request() {
        System.out.println("this is real request.");
    }

}
