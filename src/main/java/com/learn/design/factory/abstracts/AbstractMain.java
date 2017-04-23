package com.learn.design.factory.abstracts;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/16 0016
 * Time: 21:58
 *
 * @author Administrator
 * @version 1.0
 */
public class AbstractMain {

    public static void main(String[] args) {

        IFactory factory = new MysqlFactory();
        IUser user = factory.createUser();

        Object o = null;
        String id = null;
        user.insert(o);
        user.update(o);
        user.select(id);
        user.delete(o);

        factory = new OracleFactory();
        IDepartment department = factory.createDepartment();
        department.insert(o);
        department.update(o);
        department.select(id);
        department.delete(o);

    }

}
