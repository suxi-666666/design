package com.learn.design.template;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/12 0012
 * Time: 20:48
 *
 * @author Administrator
 * @version 1.0
 */
public class Teacher extends TemplatePerson {

    @Override
    protected void run() {
        System.out.println("走路");
    }

    @Override
    protected void eat() {
        System.out.println("食堂吃饭");
    }

    @Override
    protected void learn() {
        System.out.println("备课");
    }

}
