package com.learn.design.state;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/17 0017
 * Time: 20:55
 *
 * @author Administrator
 * @version 1.0
 */
public class StateSleep extends State {

    @Override
    protected void program(Work work) {
        System.out.println("不行了,睡觉.");
    }

}
