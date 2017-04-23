package com.learn.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/24 0024
 * Time: 22:32
 *
 * @author Administrator
 * @version 1.0
 */
public class AggregateConcrete extends Aggregate {

    private List<Object> list = new ArrayList<Object>();

    @Override
    Iterator createIterator() {
        return new IteratorConcrete(this);
    }

    public Integer conut() {
        return list.size();
    }

    public Object get(Integer index) {
        return list.get(index);
    }

    public void add(Object object) {
        list.add(object);
    }

}
