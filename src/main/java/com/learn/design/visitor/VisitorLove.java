package com.learn.design.visitor;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/2/2 0002
 * Time: 14:29
 *
 * @author Administrator
 * @version 1.0
 */
public class VisitorLove extends Visitor {

    private static final String ACTION = "恋爱";

    @Override
    void man(ElementMan man) {
        System.out.format("%s %s时,凡事不懂也要装懂.\n", man.NAME, ACTION);
    }

    @Override
    void woman(ElementWoman woman) {
        System.out.format("%s %s时,遇事懂也装作不懂.\n", woman.NAME, ACTION);
    }

}
