package com.learn.design.flyweight;

import java.util.Hashtable;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/30 0030
 * Time: 15:14
 *
 * @author Administrator
 * @version 1.0
 */
public class WebSiteFactory {

    private Hashtable<String, WebSite> hashtable = new Hashtable<String, WebSite>();

    public WebSite getWebSite(String key) {
        if (hashtable.containsKey(key)) {
            return hashtable.get(key);
        }
        hashtable.put(key, new WebSiteConcrete(key));
        return hashtable.get(key);
    }

    public Integer count() {
        return hashtable.size();
    }

}
