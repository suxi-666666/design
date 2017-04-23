package com.learn.design.factory.abstracts;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/16 0016
 * Time: 21:40
 *
 * @author Administrator
 * @version 1.0
 */
public interface IFactory {

    IUser createUser();

    IDepartment createDepartment();

}
