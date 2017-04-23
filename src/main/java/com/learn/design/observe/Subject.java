package com.learn.design.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/15 0015
 * Time: 10:00
 *
 * @author Administrator
 * @version 1.0
 */
public abstract class Subject {

    abstract void notifys();

    protected String state;
    protected List<Observe> list = new ArrayList<Observe>();

    protected void add(Observe observe) {
        list.add(observe);
    }

    protected boolean remove(Observe observe) {
        return list.remove(observe);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
