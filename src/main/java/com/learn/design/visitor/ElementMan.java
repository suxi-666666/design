package com.learn.design.visitor;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/2/2 0002
 * Time: 14:17
 *
 * @author Administrator
 * @version 1.0
 */
public class ElementMan extends Element {

    public static final String NAME = "男人";

    @Override
    void accept(Visitor visitor) {
        visitor.man(this);
    }

}
