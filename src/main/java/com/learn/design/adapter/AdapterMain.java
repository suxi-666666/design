package com.learn.design.adapter;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/18 0018
 * Time: 22:39
 *
 * @author Administrator
 * @version 1.0
 */
public class AdapterMain {

    public static void main(String[] args) {

        PlayerTranslate translate = new PlayerTranslate();

        translate.attack();
        translate.defense();

    }

}
