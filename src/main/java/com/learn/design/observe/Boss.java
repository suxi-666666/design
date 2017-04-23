package com.learn.design.observe;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/15 0015
 * Time: 10:10
 *
 * @author Administrator
 * @version 1.0
 */
public class Boss extends Subject {

    @Override
    void notifys() {
        for (Observe observe : this.list) {
            observe.update();
        }
    }

}
