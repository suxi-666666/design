package com.learn.design.factory.factory;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/9 0009
 * Time: 21:11
 *
 * @author Administrator
 * @version 1.0
 */
public class Dog extends Animal {

    @Override
    void run() {
        System.out.println("dog run.");
    }

    @Override
    void call() {
        System.out.println("dog call.");
    }

    @Override
    void eat() {
        System.out.println("dog eat.");
    }

    @Override
    void sleep() {
        System.out.println("dog sleep.");
    }

}
