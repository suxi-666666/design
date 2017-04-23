package com.learn.design.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/14 0014
 * Time: 11:49
 *
 * @author Administrator
 * @version 1.0
 */
public class Product {

    private List<String> list = new ArrayList<String>();

    public void add(String part) {
        list.add(part);
    }

    public void show() {
        System.out.println("构建产品: ");
        for (String part : list) {
            System.out.println("build: " + part);
        }
    }

}
