package com.learn.design.single;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/24 0024
 * Time: 22:19
 *
 * @author Administrator
 * @version 1.0
 */
public class SingleMain {

    public static void main(String[] args) {

        SingleHungry s1 = SingleHungry.getInstance();
        SingleHungry s2 = SingleHungry.getInstance();

        System.out.println(s1 == s2);

        SingleLazy s3 = SingleLazy.getInstance();
        SingleLazy s4 = SingleLazy.getInstance();

        System.out.println(s3 == s4);

    }

}
