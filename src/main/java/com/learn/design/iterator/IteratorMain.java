package com.learn.design.iterator;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/24 0024
 * Time: 22:39
 *
 * @author Administrator
 * @version 1.0
 */
public class IteratorMain {

    public static void main(String[] args) {

        AggregateConcrete aggregateConcrete = new AggregateConcrete();

        aggregateConcrete.add("0");
        aggregateConcrete.add("1");
        aggregateConcrete.add("2");
        aggregateConcrete.add("3");
        aggregateConcrete.add("4");

        Iterator iterator = new IteratorConcrete(aggregateConcrete);

        while (iterator.hasNext()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }

    }

}
