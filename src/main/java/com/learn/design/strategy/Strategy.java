package com.learn.design.strategy;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/5 0005
 * Time: 20:56
 *
 * @author Administrator
 * @version 1.0
 */
public abstract class Strategy {

    /**
     * 计算方法
     *
     * @param money 总金额
     * @return
     */
    protected abstract Double acceptCash(Double money);

}
