package com.learn.design.strategy;

import java.util.Random;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/5 0005
 * Time: 21:27
 *
 * @author Administrator
 * @version 1.0
 */
public class StrategyMain {

    public static void main(String[] args) {

        Double total = 0d;

        Random random = new Random();

        for (int i = 0; i < 9; i ++) {
            total += new Context(getType(random.nextInt(3))).getResult(getCount(random));
        }

        System.out.println("总价: " + total + "元.");

    }

    public static Double getCount(Random random) {
        Double d = ((random.nextInt(30) + 1) + (random.nextInt(50) + 1)) * 1.0;
        System.out.println("某商品总价: " + d + "元.");
        return d;
    }

    public static EStrategyType getType(Integer integer) {
        switch (integer) {
            case 0:
                return EStrategyType.NORMAL;
            case 1:
                return EStrategyType.DISCOUNT;
            case 2:
                return EStrategyType.FULL_CUT;
        }
        return null;
    }

}
