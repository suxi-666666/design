package com.learn.design.visitor;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/2/2 0002
 * Time: 14:23
 *
 * @author Administrator
 * @version 1.0
 */
public class VisitorMain {

    public static void main(String[] args) {

        ObjectStructure structure = new ObjectStructure();

        structure.add(new ElementMan());
        structure.add(new ElementWoman());

        VisitorSuccess success = new VisitorSuccess();
        VisitorFail fail = new VisitorFail();
        VisitorLove love = new VisitorLove();

        structure.accept(success);
        structure.accept(fail);
        structure.accept(love);

    }

}
