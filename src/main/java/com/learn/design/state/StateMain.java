package com.learn.design.state;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/17 0017
 * Time: 21:04
 *
 * @author Administrator
 * @version 1.0
 */
public class StateMain {

    public static void main(String[] agrs) {

        Work work = new Work();
        work.setHours(9);
        work.program();
        work.setHours(10);
        work.program();
        work.setHours(12);
        work.program();
        work.setHours(13);
        work.program();
        work.setHours(14);
        work.program();
        work.setHours(16);
        work.program();

//        work.setFinish(true);
        work.setFinish(false);

        work.setHours(19);
        work.program();
        work.setHours(22);
        work.program();

    }

}
