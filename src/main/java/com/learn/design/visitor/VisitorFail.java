package com.learn.design.visitor;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/2/2 0002
 * Time: 14:26
 *
 * @author Administrator
 * @version 1.0
 */
public class VisitorFail extends Visitor {

    private static final String ACTION = "失败";

    @Override
    void man(ElementMan man) {
        System.out.format("%s %s时,闷头喝酒,谁也不用劝.\n", man.NAME, ACTION);
    }

    @Override
    void woman(ElementWoman woman) {
        System.out.format("%s %s时,眼泪汪汪,谁也劝不了.\n", woman.NAME, ACTION);
    }

}
