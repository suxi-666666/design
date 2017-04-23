package com.learn.design.builder;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/14 0014
 * Time: 12:13
 *
 * @author Administrator
 * @version 1.0
 */
public class BuildMain {

    public static void main(String[] args) {

        Director director = new Director();

        BuilderCat builderCat = new BuilderCat();
        director.constract(builderCat);
        Product cat = builderCat.getProduct();
        cat.show();

        BuildDog buildDog = new BuildDog();
        director.constract(buildDog);
        Product dog = buildDog.getProduct();
        dog.show();


    }

}
