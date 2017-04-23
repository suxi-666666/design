package com.learn.design.memento;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/21 0021
 * Time: 20:21
 *
 * @author Administrator
 * @version 1.0
 */
public class Originator {

    private String state;

    public Memento createMemento(String state) {
        return new Memento(state);
    }

    public void setMemento(Memento memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void show() {
        System.out.println("state: " + state);
    }

}
