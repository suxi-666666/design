package com.learn.design.chain;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/28 0028
 * Time: 9:02
 *
 * @author Administrator
 * @version 1.0
 */
public abstract class Manager {

    public static final String TYPE = "请假";
    public static final String MANY_TYPE = "加薪";

    protected String name;
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    abstract void requestApplication(Request request);

}
