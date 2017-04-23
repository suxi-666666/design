package com.learn.design.factory.abstracts.method;

import com.learn.design.factory.abstracts.IDepartment;
import com.learn.design.factory.abstracts.IFactory;
import com.learn.design.factory.abstracts.IUser;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/16 0016
 * Time: 22:11
 *
 * @author Administrator
 * @version 1.0
 */
public class DataAccess {

    private static final String PACKAGE = "com.learn.design.factory.abstracts.";
    private static final String DB_NAME = PACKAGE + "MysqlFactory";

    private static IFactory factory = null;

    static {
        try {
            factory = (IFactory) Class.forName(DB_NAME).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    public static IUser createUser() {
        return factory.createUser();
    }

    public static IDepartment createDepartment() {
        return factory.createDepartment();
    }

}
