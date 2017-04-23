package com.learn.design.chain;

import com.sun.org.apache.regexp.internal.RE;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/28 0028
 * Time: 9:03
 *
 * @author Administrator
 * @version 1.0
 */
public class ManagerMajordomo extends Manager {

    public ManagerMajordomo(String name) {
        super(name);
    }

    @Override
    void requestApplication(Request request) {
        if (request.getType() == Manager.TYPE && request.getNum() <= 5) {
            System.out.format("%s %s 数量 %s 被批准.\n", name, request.getType(), request.getNum());
        } else if (superior != null) {
            superior.requestApplication(request);
        }
    }

}