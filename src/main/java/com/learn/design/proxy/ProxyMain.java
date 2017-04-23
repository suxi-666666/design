package com.learn.design.proxy;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/9 0009
 * Time: 20:49
 *
 * @author Administrator
 * @version 1.0
 */
public class ProxyMain {

    public static void main(String[] args) {

        Proxy proxy = new Proxy(new RealSubject());

        proxy.request();

    }

}
