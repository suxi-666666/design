package com.learn.design.adapter;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/18 0018
 * Time: 22:40
 *
 * @author Administrator
 * @version 1.0
 */
public class PlayerTranslate extends Player {

    private Foreign foreign = new Foreign();

    @Override
    void attack() {
        foreign.attack();
    }

    @Override
    void defense() {
        foreign.defense();
    }

}
