package com.learn.design.midator;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/29 0029
 * Time: 9:20
 *
 * @author Administrator
 * @version 1.0
 */
public class MidatorMain {

    public static void main(String[] args) {

        UnitedNationsSecurityCouncil securityCouncil = new UnitedNationsSecurityCouncil();

        CountryUSA usa = new CountryUSA(securityCouncil);
        CountryIraq iraq = new CountryIraq(securityCouncil);

        securityCouncil.setUsa(usa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  );
        securityCouncil.setIraq(iraq);

        securityCouncil.declare("不准研究核武器,否则要发动战争.\n", iraq);
        securityCouncil.declare("我们没有核武器,也不怕战争.\n", usa);

    }

}
