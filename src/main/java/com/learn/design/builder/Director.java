package com.learn.design.builder;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/14 0014
 * Time: 11:51
 *
 * @author Administrator
 * @version 1.0
 */
public class Director {

    public void constract(IBuildAnimalToy animalToy) {
        animalToy.head();
        animalToy.body();
        animalToy.foot();
    }

}
