package com.learn.design.state;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/17 0017
 * Time: 20:54
 *
 * @author Administrator
 * @version 1.0
 */
public class StateAfternoon extends State {

    @Override
    protected void program(Work work) {
        if (work.getHours() < 17) {
            System.out.println("下午工作.");
        } else {
            work.setState(new StateEvening());
            work.program();
        }
    }

}
