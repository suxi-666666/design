package com.learn.design.factory.factory;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/9 0009
 * Time: 21:14
 *
 * @author Administrator
 * @version 1.0
 */
public class FactoryMain {

    public static void main(String[] args) {

        IFactory factory = new DogFactory();

        Animal animal = factory.newInstance();

        animal.call();
        animal.run();

        IFactory iFactory = new CatFactory();

        animal = iFactory.newInstance();

        animal.call();
        animal.run();

    }

}
