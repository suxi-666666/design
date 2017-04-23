package com.learn.design.chain;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/28 0028
 * Time: 9:17
 *
 * @author Administrator
 * @version 1.0
 */
public class ChainMain {

    public static void main(String[] args) {

        ManagerCommon common = new ManagerCommon("name 1 ");
        ManagerMajordomo majordomo = new ManagerMajordomo("name 2 ");
        ManagerGeneral general = new ManagerGeneral("name 3 ");

        common.setSuperior(majordomo);
        majordomo.setSuperior(general);

        Request request1 = new Request();
        request1.setType(Manager.TYPE);
        request1.setContent("suxi " + Manager.TYPE);
        request1.setNum(1);
        common.requestApplication(request1);

        Request request2 = new Request();
        request2.setType(Manager.TYPE);
        request2.setContent("suxi " + Manager.TYPE);
        request2.setNum(5);
        common.requestApplication(request2);

        Request request3 = new Request();
        request3.setType(Manager.MANY_TYPE);
        request3.setContent("suxi " + Manager.MANY_TYPE);
        request3.setNum(400);
        common.requestApplication(request3);

        Request request4 = new Request();
        request4.setType(Manager.MANY_TYPE);
        request4.setContent("suxi " + Manager.MANY_TYPE);
        request4.setNum(1000);
        common.requestApplication(request4);

    }

}
