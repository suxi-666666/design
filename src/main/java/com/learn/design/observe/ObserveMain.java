package com.learn.design.observe;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/15 0015
 * Time: 10:13
 *
 * @author Administrator
 * @version 1.0
 */
public class ObserveMain {

    public static void main(String[] args) {

        Boss suxi = new Boss();
        suxi.setState("boss 回来了");

        ObserveShares observeShares = new ObserveShares("张三", suxi);
        ObserveNBA observeNBA = new ObserveNBA("李四", suxi);
        ObserveShares wangwu = new ObserveShares("王五", suxi);

        suxi.add(observeShares);
        suxi.add(observeNBA);
        suxi.add(wangwu);

        suxi.remove(wangwu);

        suxi.notifys();

    }

}
