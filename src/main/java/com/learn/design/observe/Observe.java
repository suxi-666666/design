package com.learn.design.observe;

import java.beans.EventHandler;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/15 0015
 * Time: 10:00
 *
 * @author Administrator
 * @version 1.0
 */
public abstract class Observe {
    EventHandler update;
    protected String name;
    protected Subject subject;

    protected Observe(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    protected abstract void update();

}
