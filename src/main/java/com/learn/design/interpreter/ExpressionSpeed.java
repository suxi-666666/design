package com.learn.design.interpreter;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/2/2 0002
 * Time: 13:48
 *
 * @author Administrator
 * @version 1.0
 */
public class ExpressionSpeed extends Expression {

    @Override
    void excute(String key, Double value) {
        String speed;
        if (value < 500) {
            speed = "慢速";
        } else if (value > 1000) {
            speed = "快速";
        } else {
            speed = "中速";
        }
        System.out.format("%s ", speed);
    }

}
