package com.learn.design.appearance;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/14 0014
 * Time: 11:22
 *
 * @author Administrator
 * @version 1.0
 */
public class Found {

    private NationalDebt nationalDebt;
    private RealEstate realEstate;
    private Shares shares;

    public Found() {
        nationalDebt = new NationalDebt();
        realEstate = new RealEstate();
        shares = new Shares();
    }

    public void payment() {
        nationalDebt.payment();
        realEstate.payment();
        shares.payment();
    }

    public void sell() {
        nationalDebt.sell();
        realEstate.sell();
        shares.sell();
    }

}
