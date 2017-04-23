package com.learn.design.factory.abstracts;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/16 0016
 * Time: 21:41
 *
 * @author Administrator
 * @version 1.0
 */
public class MysqlFactory implements IFactory {

    @Override
    public IUser createUser() {
        return new MysqlUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new MysqlDepartment();
    }

}
