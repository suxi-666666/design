package com.learn.design.observe;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/15 0015
 * Time: 10:01
 *
 * @author Administrator
 * @version 1.0
 */
public class ObserveNBA extends Observe {

    protected ObserveNBA(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.format("%s, %s 关闭NBA直播,开始工作.\n", this.subject.getState(), this.name);
    }

}
