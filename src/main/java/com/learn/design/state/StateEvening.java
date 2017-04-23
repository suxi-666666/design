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
public class StateEvening extends State {

    @Override
    protected void program(Work work) {
        if (work.getFinish()) {
            work.setState(new StateRest());
            work.program();
        } else {
            if (work.getHours() < 21) {
                System.out.println("傍晚工作.");
            } else {
                work.setState(new StateSleep());
                work.program();
            }
        }
    }

}
