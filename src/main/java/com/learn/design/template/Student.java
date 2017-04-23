package com.learn.design.template;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/12 0012
 * Time: 20:47
 *
 * @author Administrator
 * @version 1.0
 */
public class Student extends TemplatePerson {

    @Override
    protected void run() {
        System.out.println("小跑");
    }

    @Override
    protected void eat() {
        System.out.println("点外卖");
    }

    @Override
    protected void learn() {
        System.out.println("背单词");
    }

}
