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
public class PlayerForward extends Player {

    @Override
    void attack() {
        System.out.println("前锋攻击.");
    }

    @Override
    void defense() {
        System.out.println("前锋防守.");
    }

}
