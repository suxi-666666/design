package com.learn.design.midator;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/29 0029
 * Time: 9:11
 *
 * @author Administrator
 * @version 1.0
 */
public class UnitedNationsSecurityCouncil extends UnitedNations {

    private CountryUSA usa;
    private CountryIraq iraq;

    public void setUsa(CountryUSA usa) {
        this.usa = usa;
    }

    public void setIraq(CountryIraq iraq) {
        this.iraq = iraq;
    }

    @Override
    void declare(String message, Country country) {
        if (usa == country) {
            usa.getMessage(message);
        } else if (iraq == country) {
            iraq.getMessage(message);
        } else {
            System.out.format("没找到可以发送消息的国家.\n");
        }
    }

}
