package com.learn.design.chain;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/28 0028
 * Time: 9:03
 *
 * @author Administrator
 * @version 1.0
 */
public class ManagerGeneral extends Manager {

    public ManagerGeneral(String name) {
        super(name);
    }

    @Override
    void requestApplication(Request request) {
        if (request.getType() == Manager.TYPE) {
            System.out.format("%s %s 数量 %s 被批准.\n", name, request.getType(), request.getNum());
        } else if (request.getType() == Manager.MANY_TYPE && request.getNum() <= 500) {
            System.out.format("%s %s 数量 %s 被批准.\n", name, request.getType(), request.getNum());
        } else if (request.getType() == Manager.MANY_TYPE && request.getNum() > 500) {
            System.out.format("%s %s 数量 %s 下一次.\n", name, request.getType(), request.getNum());
        }
    }

}