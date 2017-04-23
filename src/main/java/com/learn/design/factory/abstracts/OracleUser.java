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
public class OracleUser implements IUser {

    @Override
    public Object select(Serializable serializable) {
        System.out.println("oracle select user.");
        return null;
    }

    @Override
    public Object insert(Object o) {
        System.out.println("oracle insert user.");
        return null;
    }

    @Override
    public Object update(Object o) {
        System.out.println("oracle update user.");
        return null;
    }

    @Override
    public Object delete(Object o) {
        System.out.println("oracle delete user.");
        return null;
    }

}
