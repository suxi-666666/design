package com.learn.design.decorate;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/8 0008
 * Time: 16:31
 *
 * @author Administrator
 * @version 1.0
 */
public class DecoratorMain {

    /**
     * 变相递归调用
     *
     * @param args
     */
    public static void main(String[] args) {

        Decorator decorator = new Decorator();

        DecoratorNecktie decoratorNecktie = new DecoratorNecktie();
        DecoratorGymShoes decoratorGymShoes = new DecoratorGymShoes();
        DecoratorSuit decoratorSuit = new DecoratorSuit();


        decoratorNecktie.setComponent(decorator);
        decoratorGymShoes.setComponent(decoratorNecktie);
        decoratorSuit.setComponent(decoratorGymShoes);
        decoratorSuit.operation();


    }

}
