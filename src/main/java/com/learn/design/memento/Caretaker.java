package com.learn.design.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/21 0021
 * Time: 20:22
 *
 * @author Administrator
 * @version 1.0
 */
public class Caretaker {

    private List<Memento> list = new ArrayList<Memento>();

    public void addMemento(Memento memento) {
        list.add(memento);
    }

    public Memento childMemento() {
        return list.remove(list.size() - 1);
    }

}
