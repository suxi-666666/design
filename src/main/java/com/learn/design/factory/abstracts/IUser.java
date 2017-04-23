package com.learn.design.factory.abstracts;

import java.io.Serializable;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/16 0016
 * Time: 21:42
 *
 * @author Administrator
 * @version 1.0
 */
public interface IUser<T, ID extends Serializable> extends IBaseDao {

}
