package com.learn.design.iterator;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/24 0024
 * Time: 22:33
 *
 * @author Administrator
 * @version 1.0
 */
public class IteratorConcrete extends Iterator {

    private AggregateConcrete aggregateConcrete;
    private Integer current = 0;

    public IteratorConcrete(AggregateConcrete aggregateConcrete) {
        this.aggregateConcrete = aggregateConcrete;
    }

    @Override
    Object first() {
        return aggregateConcrete.get(0);
    }

    @Override
    Object next() {
        current ++;
        if (current < aggregateConcrete.conut()) {
            return aggregateConcrete.get(current);
        }
        return null;
    }

    @Override
    Boolean hasNext() {
        return current < aggregateConcrete.conut();
    }

    @Override
    Object currentItem() {
        return aggregateConcrete.get(current);
    }

}
