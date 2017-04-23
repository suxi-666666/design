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
public class DogFactory implements IFactory {

    @Override
    public Animal newInstance() {
        return new Dog();
    }

}
