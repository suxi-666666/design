package com.learn.design.visitor;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/2/2 0002
 * Time: 14:25
 *
 * @author Administrator
 * @version 1.0
 */
public class VisitorSuccess extends Visitor {

    private static final String ACTION = "成功";

    @Override
    void man(ElementMan man) {
        System.out.format("%s %s时,背后多半有一个成功的女人.\n", man.NAME, ACTION);
    }

    @Override
    void woman(ElementWoman woman) {
        System.out.format("%s %s时,背后多半有一个不成功的男人.\n", woman.NAME, ACTION);
    }

}
