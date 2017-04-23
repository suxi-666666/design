package com.learn.design.decorate;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/8 0008
 * Time: 16:10
 *
 * @author Administrator
 * @version 1.0
 */
public abstract class Component {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void operation();

}
