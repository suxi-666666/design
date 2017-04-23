package com.learn.design.bridge;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/25 0025
 * Time: 16:41
 *
 * @author Administrator
 * @version 1.0
 */
public class BridgeMain {

    public static void main(String[] args) {

        Abstraction abstraction = new Abstraction();

        abstraction.setImplementor(new ImplementorGame());
        abstraction.operation();

        abstraction.setImplementor(new ImplementorAddressList());
        abstraction.operation();

    }

}
