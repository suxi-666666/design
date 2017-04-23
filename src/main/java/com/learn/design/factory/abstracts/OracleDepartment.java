package com.learn.design.factory.abstracts;

import java.io.Serializable;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/16 0016
 * Time: 21:44
 *
 * @author Administrator
 * @version 1.0
 */
public class OracleDepartment implements IDepartment {

    @Override
    public Object select(Serializable serializable) {
        System.out.println("oracle select department.");
        return null;
    }

    @Override
    public Object insert(Object o) {
        System.out.println("oracle insert department.");
        return null;
    }

    @Override
    public Object update(Object o) {
        System.out.println("oracle update department.");
        return null;
    }

    @Override
    public Object delete(Object o) {
        System.out.println("oracle delete department.");
        return null;
    }

}
