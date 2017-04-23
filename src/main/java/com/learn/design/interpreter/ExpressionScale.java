package com.learn.design.interpreter;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/2/2 0002
 * Time: 13:40
 *
 * @author Administrator
 * @version 1.0
 */
public class ExpressionScale extends Expression {

    @Override
    void excute(String key, Double value) {
        String scale = "";
        switch (value.intValue()) {
            case 1:
                scale = "低音";
                break;
            case 2:
                scale = "中音";
                break;
            case 3:
                scale = "高音";
                break;
        }
        System.out.format("%s ", scale);
    }

}
