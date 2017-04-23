package com.learn.design.factory.factory;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/9 0009
 * Time: 21:12
 *
 * @author Administrator
 * @version 1.0
 */
public class Cat extends Animal {

    @Override
    void run() {
        System.out.println("cat run.");
    }

    @Override
    void call() {
        System.out.println("cat call.");
    }

    @Override
    void eat() {
        System.out.println("cat eat.");
    }

    @Override
    void sleep() {
        System.out.println("cat sleep.");
    }

}
