package com.learn.design.factory.abstracts;

import java.io.Serializable;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/16 0016
 * Time: 21:46
 *
 * @author Administrator
 * @version 1.0
 */
public interface IBaseDao<T, ID extends Serializable> {

    T select(ID id);

    T insert(T t);

    T update(T t);

    T delete(T t);

}
