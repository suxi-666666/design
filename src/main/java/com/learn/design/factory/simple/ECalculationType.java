package com.learn.design.factory.simple;

import com.learn.design.IEnum;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/3 0003
 * Time: 21:22
 *
 * @author Administrator
 * @version 1.0
 */
public enum ECalculationType implements IEnum<String> {

    /**
     * 加
     */
    PLUS("+"),

    /**
     * 减
     */
    REDUCE("-"),

    /**
     * 乘
     */
    RIDE("*"),

    /**
     * 除
     */
    EXCEPT("/");

    private String description;

    ECalculationType(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

}
