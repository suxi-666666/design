package com.learn.design.prototype;


import com.learn.design.IEnum;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/11 0011
 * Time: 21:03
 *
 * @author Administrator
 * @version 1.0
 */
public enum ESex implements IEnum<String> {

    /**
     * 0
     */
    MAN("男"),

    /**
     * 1
     */
    WOMAN("女");

    private String description;

    ESex(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

}
