package com.learn.design.observe;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/15 0015
 * Time: 10:02
 *
 * @author Administrator
 * @version 1.0
 */
public class ObserveShares extends Observe {

    protected ObserveShares(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.format("%s, %s 关闭股票,开始工作.\n", this.subject.getState(), this.name);
    }

}
