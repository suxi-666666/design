package com.learn.design.flyweight;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/30 0030
 * Time: 15:17
 *
 * @author Administrator
 * @version 1.0
 */
public class FlyWeightMain {

    public static void main(String[] args) {

        WebSiteFactory factory = new WebSiteFactory();

        WebSite ws1 = factory.getWebSite("产品展示");
        ws1.use(new User("name 1 "));

        WebSite ws2 = factory.getWebSite("产品展示");
        ws2.use(new User("name 2 "));

        WebSite ws3 = factory.getWebSite("产品展示");
        ws3.use(new User("name 3 "));

        WebSite ws4 = factory.getWebSite("博客");
        ws4.use(new User("name 4 "));

        WebSite ws5 = factory.getWebSite("博客");
        ws5.use(new User("name 5 "));

        WebSite ws6 = factory.getWebSite("博客");
        ws6.use(new User("name 6 "));

        System.out.format("网站分类总数为: %d", factory.count());

    }

}
