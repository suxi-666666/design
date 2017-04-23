package com.learn.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/22 0022
 * Time: 22:15
 *
 * @author Administrator
 * @version 1.0
 */
public class CompanyConcrete extends Company {

    private List<Company> child = new ArrayList<Company>();

    public CompanyConcrete(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        child.add(company);
    }

    @Override
    public void remove(Company company) {
        child.remove(company);
    }

    @Override
    public void display(int depth) {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < depth; i ++) {
            s.append("-");
        }
        System.out.println(s.toString() + name);
        for (Company company : child) {
            company.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company company : child) {
            company.lineOfDuty();
        }
    }

}
