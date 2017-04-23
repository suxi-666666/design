package com.learn.design.state;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/17 0017
 * Time: 21:14
 *
 * @author Administrator
 * @version 1.0
 */
public class StateRest extends State {

    @Override
    protected void program(Work work) {
        System.out.println("下班回家.");
    }

}
