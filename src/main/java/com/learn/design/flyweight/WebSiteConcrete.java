package com.learn.design.flyweight;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/30 0030
 * Time: 15:16
 *
 * @author Administrator
 * @version 1.0
 */
public class WebSiteConcrete extends WebSite {

    private String name;

    public WebSiteConcrete(String name) {
        this.name = name;
    }

    @Override
    void use(User user) {
        System.out.format("网站分类: %s 用户: %s\n", name ,user.getName());
    }

}
