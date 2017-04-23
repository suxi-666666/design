package com.learn.design.decorate;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/8 0008
 * Time: 16:19
 *
 * @author Administrator
 * @version 1.0
 */
public class DecoratorNecktie extends Decorator {

    @Override
    public void operation() {
        System.out.print("领带 ");
        super.operation();
    }

}
