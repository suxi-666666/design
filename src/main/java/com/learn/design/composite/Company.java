package com.learn.design.composite;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/22 0022
 * Time: 22:12
 *
 * @author Administrator
 * @version 1.0
 */
public abstract class Company {

    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company company);

    public abstract void remove(Company company);

    public abstract void display(int depth);

    public abstract void lineOfDuty();

}
