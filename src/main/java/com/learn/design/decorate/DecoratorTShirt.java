package com.learn.design.decorate;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/8 0008
 * Time: 16:15
 *
 * @author Administrator
 * @version 1.0
 */
public class DecoratorTShirt extends Decorator {

    @Override
    public void operation() {
        System.out.print("T恤 ");
        super.operation();
    }

}
