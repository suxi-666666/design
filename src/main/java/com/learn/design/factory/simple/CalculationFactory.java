package com.learn.design.factory.simple;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/3 0003
 * Time: 21:22
 *
 * @author Administrator
 * @version 1.0
 */
public class CalculationFactory {

    public static Calculation getInstance(ECalculationType type) {
        switch (type) {
            case PLUS:
                return new CalculationPlus();
            case REDUCE:
                return new CalculationReduce();
            case RIDE:
                return new CalculationRide();
            case EXCEPT:
                return new CalculationExcept();
            default:
                System.out.println("请输入正确的运算符.");
                return null;
        }
    }

}
