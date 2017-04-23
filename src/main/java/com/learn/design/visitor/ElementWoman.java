package com.learn.design.visitor;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/2/2 0002
 * Time: 14:18
 *
 * @author Administrator
 * @version 1.0
 */
public class ElementWoman extends Element {

    public static final String NAME = "女人";

    @Override
    void accept(Visitor visitor) {
        visitor.woman(this);
    }

}
