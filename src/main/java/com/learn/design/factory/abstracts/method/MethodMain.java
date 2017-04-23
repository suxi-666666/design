package com.learn.design.factory.abstracts.method;

import com.learn.design.factory.abstracts.IDepartment;
import com.learn.design.factory.abstracts.IUser;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/16 0016
 * Time: 22:24
 *
 * @author Administrator
 * @version 1.0
 */
public class MethodMain {

    public static void main(String[] args) {

        IUser user = DataAccess.createUser();

        Object o = null;
        String id = null;
        user.insert(o);
        user.update(o);
        user.select(id);
        user.delete(o);

        IDepartment department = DataAccess.createDepartment();
        department.insert(o);
        department.update(o);
        department.select(id);
        department.delete(o);

    }

}
