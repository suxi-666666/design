package com.learn.design.adapter;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/18 0018
 * Time: 22:36
 *
 * @author Administrator
 * @version 1.0
 */
public class PlayerCenterForward extends Player {

    @Override
    void attack() {
        System.out.println("中锋攻击.");
    }

    @Override
    void defense() {
        System.out.println("中锋防守.");
    }

}
