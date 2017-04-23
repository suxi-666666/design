package com.learn.design.proxy;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/9 0009
 * Time: 20:39
 *
 * @author Administrator
 * @version 1.0
 */
public class Proxy implements ISubject {

    private RealSubject subject;

    public Proxy(RealSubject subject) {
        if (subject == null) {
            subject = new RealSubject();
        }
        this.subject = subject;
    }

    @Override
    public void request() {
        subject.request();
    }

}
