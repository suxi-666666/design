package com.learn.design.factory.simple;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/3 0003
 * Time: 21:39
 *
 * @author Administrator
 * @version 1.0
 */
public class SimpleMain {

    public static void main(String[] args) {

        Calculation calculation = CalculationFactory.getInstance(ECalculationType.EXCEPT);

        calculation.setTwoNum(1.9);

        System.out.println(calculation.calculation());


    }

}
