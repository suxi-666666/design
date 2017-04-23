package com.learn.design.strategy;

import com.learn.design.IEnum;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/5 0005
 * Time: 21:19
 *
 * @author Administrator
 * @version 1.0
 */
public enum EStrategyType implements IEnum<String> {

    /**
     * 正常
     */
    NORMAL("正常"),

    /**
     * 打折
     */
    DISCOUNT("打折"),

    /**
     * 满减
     */
    FULL_CUT("满减");

    private String description;

    EStrategyType(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

}
