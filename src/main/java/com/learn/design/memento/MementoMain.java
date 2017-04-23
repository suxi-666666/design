package com.learn.design.memento;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/21 0021
 * Time: 20:28
 *
 * @author Administrator
 * @version 1.0
 */
public class MementoMain {

    public static void main(String[] args) {

        Originator originator = new Originator();
        originator.setState("one");
        originator.show();

        Caretaker caretaker = new Caretaker();
        caretaker.addMemento(originator.createMemento("two"));

        originator.show();

        originator.setMemento(caretaker.childMemento());
        originator.show();

    }

}
