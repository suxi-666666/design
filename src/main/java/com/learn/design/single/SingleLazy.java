package com.learn.design.single;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/24 0024
 * Time: 22:11
 *
 * @author Administrator
 * @version 1.0
 */
public class SingleLazy {

    private static SingleLazy singleLazy;

    private SingleLazy() {

    }

    public static synchronized SingleLazy getInstance() {
        if (singleLazy == null) {
            singleLazy = new SingleLazy();
        }
        return singleLazy;
    }

}
