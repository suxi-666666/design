package com.learn.design.factory.abstracts;

import java.io.Serializable;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/16 0016
 * Time: 21:43
 *
 * @author Administrator
 * @version 1.0
 */
public class MysqlUser implements IUser {

    @Override
    public Object select(Serializable serializable) {
        System.out.println("mysql select user.");
        return null;
    }

    @Override
    public Object insert(Object o) {
        System.out.println("mysql insert user.");
        return null;
    }

    @Override
    public Object update(Object o) {
        System.out.println("mysql update user.");
        return null;
    }

    @Override
    public Object delete(Object o) {
        System.out.println("mysql delete user.");
        return null;
    }

}
